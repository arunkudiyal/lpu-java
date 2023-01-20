package com.company;

import java.util.Scanner;

public class Functions {

    // FUNCTIONS :->
    // Block of code which can be re-used at any point of time in the code by simple calling the function.

    // Create a function
    // public static returnType functionName(parameters). Note -> returnType could be void if not returning anything.
    // arguments / parameters -> the dynamic values, which should be passed by the statement calling the function
    // Your functions will only be static if you are designing the function inside the same class where main is defined.
    public static int add(int num1, int num2) {
        int c = num1 + num2;
        return c;
    }

    public static void main(String[] args) {
        // Function Call
        // Q:- You are given with two numbers, your job is to find the square of the sum.
        //        Scanner sc = new Scanner(System.in);
        //        int a = sc.nextInt();
        //        int b = sc.nextInt();
        //        int total = add(a, b);
        //        System.out.println("The square of the sum of " + a + " and " + b + " is -> " + total * total);

        //        Scanner sc = new Scanner(System.in);
        //        int num1 = sc.nextInt();
        //        int num2 = sc.nextInt();
        //        char ch = sc.next().charAt(0);
        //
        //        switch (ch) {
        //            case '+':
        //                System.out.println(num1 + num2);
        //                break;
        //            case '-':
        //                System.out.println(num1 - num2);
        //                break;
        //            case '*':
        //                System.out.println(num1 * num2);
        //                break;
        //            case '/':
        //                System.out.println(num1 / num2);
        //                break;
        //            case '%':
        //                System.out.println(num1 % num2);
        //                break;
        //            default:
        //                System.out.println("Invalid Input!");
        //                break;
        //        }

        // Creating an array on int type of size 5
        // SYNTAX -> type[] arrName = new type[size]

        // Q:- Create a dynamic array, taking the size from the size and the elements from the user & print the array.
        //        Scanner sc = new Scanner(System.in);
        //        int n = sc.nextInt();
        //        // Build the array of the specified size
        //        int[] numbers = new int[n];
        //
        //        // Loop to take the input from the user
        //        for(int i=0; i <= n-1; i++)
        //            numbers[i] = sc.nextInt();
        //
        //        // Loop to print the output of the array
        //        for(int i=0; i < n; i++)
        //            System.out.print(numbers[i] + " ");
        //        System.out.println();

    }
}
