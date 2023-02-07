package com.company;

public class PermutationsOfString {
    public static void printPermutations(String str, String answer) {
        if(str.length() == 0) {
            System.out.print(answer + " ");
            return;
        }
        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Remaining String -> ch = 'a', remaining = "bc"
            // ch = "b", remaining = substring(0, 1) = "a" + substring(2, 2) = "c"
            String remaining = str.substring(0, i) + str.substring(i+1, str.length());
            printPermutations(remaining, answer + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        // abc, acb, bac, bca, cba, cab --> No of permutations = length!
        printPermutations(str, "");
        // i = 0
        // printPermutations("abc", "");    // Removed
        // printPermutations("bc", "a")     // Removed
        // printPermutations("c", "ab")     // Removed
        // printPermutations("", "abc")     // Removed --> abc
        // printPermutations("b", "ac")     // Removed
        // printPermutations("", "acb")     // Removed --> acb

        // i = 1
        // printPermutations("ac", "b")
        // printPermutations("c", "ba")     // Removed
        // printPermutations("", "bac")     // Removed --> bac
        // printPermutations("a", "bc")
        // printPermutations("", "bca")     // Removed --> bca

        // i = 2
        // printPermutations("ab", "c")
        // printPermutations("b", "ca")     // Removed
        // printPermutations("", "cab")     // Removed --> cab
        // printPermutations("a", "cb")
        // printPermutations("", "cba")     // Removed --> cba

        // i = 3 --> LOOP BREAKS

        System.out.println();
    }
}
