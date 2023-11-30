var express = require('express');
var router = express.Router();
var userModel = require('./users');
const passport = require('passport');

const localStrategy = require("passport-local");
passport.use(new localStrategy(userModel.authenticate()));

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index');
});

router.get('/login', function (req, res, next) {
  res.render('login',{error:req.flash('error')});
});

router.get('/reminder', function (req, res, next) {
  res.render('reminder');
});

router.post('/register',function(req,res,next){
  var newUser = new userModel({
    username: req.body.username,
    email: req.body.email,
    })
  userModel.register(newUser,req.body.password)
  .then(function(u){
    passport.authenticate('local')(req,res,function(){
      res.redirect("/home");
    })
  })
  .catch(function(e){
    res.send(e);
  })
})

router.get('/home',isLoggedIn, async function(req,res,next){
  let user = await userModel.findOne({username:req.session.passport.user});
  console.log(user);
  res.render('home',{user});
})

router.post('/login',passport.authenticate('local',
{
  successRedirect:'/home',
  failureRedirect:'/login',
  failureFlash:true
}),function(req,res,next){});

router.get("/logout", function(req, res) {
  req.logout(function(err) {
  if (err) { return next(err); }
  res.redirect('/');
  });
})

function isLoggedIn(req,res,next){
  if(req.isAuthenticated()){
    return next();
  }
  else{
    res.redirect('/login');
  }
}

module.exports = router;
