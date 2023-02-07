package com.company;

import java.util.ArrayList;

public class Strings {
    public static void main(String[] args) {
        String str0 = "Java Programming";                                           // OBJECT
        // String str1 = new String("Java Programming");                            // OBJECT
        // String str2;
        // System.out.println(str1);
        // Strings are nothing but simple array pool of characters.
        char[] name = {'J', 'a', 'v', 'a', ' ', 'P', 'r', 'o', 'g', 'g'};           // ARRAY
        int[] integers = {0, 1, 2, 3, 4, 5};
        System.out.println(name);                                                // Address of first element
        System.out.println(name[1]);           // charAt(i)                      // 'a'
        System.out.println(integers);                                           // Address -> [I@2f92e0f4
        // System.out.println(str0[1]);                                         // ERROR

        // STRING METHODS :- Do the manipulations at the String object
        // 1. charAt() --> Find a char at a specified index.
        for(int i=0; i < str0.length(); i++)
            System.out.print( str0.charAt(i) + "\t" );

        System.out.println();

        for(int i=str0.length() - 1; i >= 0; i--)
            System.out.print( str0.charAt(i) + "\t" );

        System.out.println();

        // 2. split() -> takes a regex, and split your strings into substrings and return the substring in an array
        String[] result = str0.split("");
        System.out.println(result.length);                                      // 4
        ArrayList<String> answer = new ArrayList<String>();
        for(int i=0; i < result.length; i++)
            answer.add(result[i]);                                              // Java & Programming

        //        for(int i= result.length - 1; i >= 0; i--)
        //            System.out.print(result[i] + "\t");

        System.out.println(answer);

        // 3. length() --> Returns an integer value depicting the length of the string
        int lengthOfString0 = str0.length();
        System.out.println("length of String 0 is - " + lengthOfString0);

        // Formatted Strings --> sout("\n"), sout("\t")
        // 4. format() --> C/C++
        char[] demoArr = {'h', 'e', 'l', '\t', 'o'};
        String demoString = "Hello... my percentage is %.3f";
        System.out.println(demoString.length());                                // 16

        String formattedOutput = String.format(demoString, 92.34);
        System.out.println(formattedOutput);                                    // Hello... my percentage is 92.34

        System.out.println(String.format("Character values are %c and %c", 'a', 'b'));

        // 5. substring(int startIndex, int endIndex)
        String myName = "John Doe";
        // Q:- Only print the first letters which is of 4 chars long
        // Way 1 -> split
        String[] answers = myName.split(" ");
        System.out.println(answers[0]);

        // Way 2 -> substring()
        String mySubStr = myName.substring(0, 4);                                   // endIndex is exclusive
        System.out.println( mySubStr );                                             // John

        // 6. contains() --> Case sensitive, if you want to check, either convert into uppercase or lowercase
        // before comparing

        // 7. toUpperCase()
        String lowerCaseName = myName.toLowerCase();
        boolean isContained = lowerCaseName.contains("doe");
        System.out.println(isContained);                                            // true

        // 8. toLowerCase()
        String upperCaseName = myName.toUpperCase();
        boolean isAlsoContained = upperCaseName.contains("DOE");
        System.out.println(isAlsoContained);                                        // true

        // 9. join() --> Joining two or more strings even including with a delimiter
        // Q -> Create a string like "hh:mm:ss" using hours, mins & secs
        String hours = "12";
        String minutes = "43";
        String seconds = "51";

        System.out.println( String.join(":", hours, minutes, seconds) );

        String stringOne = "This is String One";
        String stringTwo = "This is String One";
        System.out.println(stringOne.equals(stringTwo));                            // true


        // Q:- Convert a String object into it's char sequence ?
        String strObject = new String("This is an original string");
        char[] strObjCharSeq = new char[strObject.length()];

        for(int i=0; i < strObject.length(); i++)
            strObjCharSeq[i] = strObject.charAt(i);

        for(int i=0; i < strObject.length(); i++)
            System.out.print(strObjCharSeq[i] + ", ");
        System.out.println();
    }
}
