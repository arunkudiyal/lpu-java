package com.company;

import java.util.Scanner;

public class Stack {
    // Create a Stack using an Array
    int MAX = 1000;
    int top;
    // Constructor
    Stack() {
        // My TOP be index pointing towards the last most element
        top = -1;
    }
    private int[] arr = new int[MAX];

    // Methods for the stack
    // 1. push(int data) --> Appends an element at the end of the stack
    public void push(int data) {
        if(top > MAX) {
            // Stack Overflow
            System.out.println("STACK OVERFLOW!!");
            return;
        } else {
            this.top += 1;
            arr[top] = data;
        }
    }

    // 2. pop(int data) --> Remove an element at the top of the stack
    public int pop() {
        if(top == -1) {
            System.out.println("STACK UNDERFLOW!!");
            return -1;
        } else {
            int removedElement = arr[top];
            top -= 1;
            return removedElement;
        }
    }

    // 3. peak --> Return thr top most element from the stack
    public int peak() {
        if(top != -1) return arr[top];
        else return -1;
    }

    // 4. size() --> Return you the total size of the size
    public int size() {
        // return top + 1;
        int size = 0;
        for(int i=0; i <= top; i++)
            size += 1;
        return size;
    }

    // 5. display()
    public void display() {
        for(int i=top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        // System.out.println(stack);      // Memory address of the object

        int firstSize = stack.size();
        System.out.println("Initially the size of the stack is - " + firstSize);

        stack.pop();    // UNDERFLOW

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int secondSize = stack.size();
        System.out.println("Initially the size of the stack is - " + secondSize);

        int topmostElt1 = stack.peak();
        System.out.println("Topmost element is - " + topmostElt1);

        stack.display();

        stack.pop();
        stack.pop();

        int thirdSize = stack.size();
        System.out.println("Initially the size of the stack is - " + thirdSize);

        int topmostElt2 = stack.peak();
        System.out.println("Topmost element is - " + topmostElt2);

        stack.display();
    }
}
