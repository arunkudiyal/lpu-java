package com.company;

public class MyStringBuilder {
    public static void addString(StringBuilder str, String newStr) {
        System.out.println( str.append(newStr) );                           // HelloWorld
    }

    public static void main(String[] args) {
        // String str = "Hello";
        // char[] arr1 = {'H', 'e', 'l', 'l', 'o'};          // size = 5     ; address = 100
        // Data Type of str --> Array

        // str = str + "World";                                // size = 10
        // char[] arr2 = {'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'};
        // Address(arr1) != Address(arr2)
        // Data Type of str --> StringBuilder

        // System.out.println(str);                            // HelloWorld

        // STRING BUILDERS
        // String s = "Learn Share Learn";
        // int output = s.indexOf('a');                        // 2
        // int output = s.indexOf('a',9);                      // 14
        // System.out.println(output);


        // PROBLEM --> Everytime you change or manipulate any String, there will always be a new memory allocated to the
        // string array in the heap memory of a different size & address.
        // Solution --> StringBuilder Class
        MyStringBuilder myStrBuilder = new MyStringBuilder();

        // String str = new String("Hello...");
        // str --> String ?? --> NO --> str[] NO
        // str --> Object --> StringBuilder Class  --> MUTABLE + It does not need any extra memory for manipulation
        StringBuilder str = new StringBuilder("Hello");
        myStrBuilder.addString(str, "World");
    }
}
