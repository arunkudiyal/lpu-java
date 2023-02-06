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
        // 1. charAt()
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

        // 4.
    }
}
