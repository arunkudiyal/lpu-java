package com.company;

import java.util.Scanner;

// If you want, you can create your own exception to handle in the code --> CUSTOM EXCEPTIONS
// I am creating my own exception i.e. InvalidAgeException, which will inherit all the props of Exception
// POINT TO NOTE -> This class is not a normal class, it is an Exception.
class InvalidAgeException extends Exception {
    // Constructor
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingSystem {
    // NOTE_NO_2 :- If you have a method which throw a custom exception then the method should declare
    // that an exception is thrown by using 'throws' keyword.
    public static void verify(int age) throws InvalidAgeException {
        // I wanted to throw an exception to the user saying "Invalid age to vote!"
        // if(age < 18) System.out.println("Age is not valid to vote!")

        // NOTE_NO_1 :- If you want to use any Custom Exception then throw the object of the Custom exception
        // by using the 'throw' keyword
        if(age < 18) throw new InvalidAgeException("Age is not valid to vote!");
        // No exception to catch ??
        else System.out.println("You can vote!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            verify(age);
        } catch(InvalidAgeException e) {
            // PRINT YOUR OWN MSG WHILE HANDLING :- System.out.println("Exception Encountered: INVALID AGE!");
            // Custom Exception Message
            System.out.println(e);
        }
    }
}
