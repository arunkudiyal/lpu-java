package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling extends Exception {
    // Error --> Anything you do out of syntax in a programming lang. is called Error, Change the syntax
    // Exception --> ?? --> A mistake which cannot be handled using syntactic sugar
    // exception handling --> try, catch & finally
    public static int calculate(int num1, int num2) {
        // if(num2 == 0) return -1;
        // Write the code which you feel might produce an exception
        // NOTE_1 --> You cannot have a try block either without a catch block or a 'finally' block.
        // NOTE_2 --> You can have as many catch block after a try block.
        // NOTE_3 --> If you handle a parent exception, then do not handle a child exception.
        // NOTE_4 --> It is not mandatory to have a 'finally' block in ever try-catch
        int solution = 0;
        int arr[] = {10, 20, 30, 40, 50};           // size = 5, index = 0 - 4
        try {
            solution = num1 / num2;                 // ArithmeticException
            // System.out.println(arr[6]);             // IndexOutOfBoundException
        }
        // DO NOT DO THIS --> ArithmeticException & ArrayIndexOutOfBoundException are children to Exception class.
        //        catch(Exception e) {
        //
        //        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("You encountered an IndexOutOfBoundException --> " + e);
        } catch(ArithmeticException e) {
            System.out.println("You encountered an exception --> " + e);
        }
        //        finally {
        //            // Code which is going to run even if the exception occurs
        //            // Disconnect from a server / DB / perform some last min operations.
        //            System.out.println("This is the 'FINALLY' Block");
        //        }
        return solution;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = calculate(a, b);
        System.out.println("Answer is -> " + ans);
    }
}
