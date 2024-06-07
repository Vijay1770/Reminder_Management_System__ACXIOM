import java.util.Scanner;
import java.util.*;
public class String_questions {
    //1.COUNT THE OCCURENCE OF CHARACTER IN STRING...
    public  static  void main(String [ ]args)
    {
        String str="aaabbbccccddd";
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();

        for(int i =0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                int count=map.get(ch);
                count++;
                map.replace(ch,count);
            }
            else{
                map.put(ch,1);
            }
        }
        for(Character key:map.keySet())
        {
            System.out.println(key+" "+map.get(key));
        }
    }

    //2.REVERSE A STRING...
    /*
        public static String reverseString(String input)
        {
            StringBuilder sb = new StringBuilder(input);
            return sb.reverse().toString();
        }

        public static void main(String[] args) {
            String originalString = "Hello World";
            String reversedString = reverseString(originalString);
            System.out.println("Reversed --> " + reversedString);
        }
        */

    //3.PALINDROM
/*
        public static String reverseString(String input)
    {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String originalString = "112211";
        String reversedString = reverseString(originalString);
        if(reversedString.equals(originalString))
        {
            System.out.println("This string match the condition of Palindrom");
        }
        else {
            System.out.println("Not Palindrom");
        }
    }
 */

    //4.REMOVE DUPLICATES...
/*
    public static void removeDuplicates(String str)
    {
        String newstr = new String();
        int length = str.length();
        for (int i = 0; i < length; i++)
        {
            char charAtPosition = str.charAt(i);
            if (newstr.indexOf(charAtPosition) == -1)
            {
                newstr += charAtPosition;
            }
        }
        System.out.println(newstr);
    }
    public static void main(String[] args)
    {
        String str = "remove duplicates";
        removeDuplicates(str);
    }

 */

    //5.ANAGRAMS...
/*
        public static boolean areAnagrams(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);
        }
        public static void main(String[] args) {
            String string1 = "listen";
            String string2 = "silent";
            if (areAnagrams(string1, string2)) {
                System.out.println(string1 + " and " + string2 + " are anagrams.");
            } else {
                System.out.println(string1 + " and " + string2 + " are not anagrams.");
            }
        }

 */

    //6.COUNT VOVLES ....
/*
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase to handle both uppercase and lowercase vowels
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String inputString = "Hello how are you";
        int vowelCount = countVowels(inputString);
        System.out.println("Number of vowels in the string -->" + vowelCount);
    }
 */

    //7.FIRST NON REPEATED CHARCTER IN STRING...
    /*
    public static void FirstNonRepeat(String s)
    {

        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i),s.indexOf(s.charAt(i)) + 1) == -1) {
                System.out.println("First non repeating character is "+ s.charAt(i));
                break;
            }
        }
        return;
    }
    public static void main (String[] args) {
        String s = "good afternoon g";
        FirstNonRepeat(s);
    }
     */
}