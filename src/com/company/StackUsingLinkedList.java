package com.company;

public class StackUsingLinkedList {
    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head, top;
    StackUsingLinkedList() {
        this.head = this.top = null;
    }

    public void push(int key) {
        Node newNode = new Node(key);
        // Stack Overflow --> While you create a new node, no address was assigned to the node
        if(newNode == null) {
            System.out.println("STACK OVERFLOW!");
            return;
        }
        // Add a node to the linked list
        if(head == null) {
            head = newNode;
            top = newNode;
        } else {
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newNode;
            top = newNode;
        }
    }

    public int pop() {
        // Case 1 -> If the stack does not exist
        if(top == null) {
            System.out.println("Stack Underflow!");
            return -1;
        } else {
            // Case 2 -> If the stack only has one Node
            if(head == top) {
                int returnedData = top.data;
                top = null;
                head = null;
                return returnedData;
            } else {
                // Linked List exists, and there are more than 2 nodes.
                Node secondLast = head;
                while(secondLast.next.next != null)
                    secondLast = secondLast.next;

                secondLast.next = null;
                int returnedData = top.data;
                top = secondLast;
                return  returnedData;
            }
        }
    }

    private void printReverse(Node head) {
        if(head == null) return;
        printReverse(head.next);
        System.out.print(head.data + " ");
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        } else {
            return top.data;
        }
    }

    public void display() {
        if(top == null) {
            System.out.println("Stack is Empty!");
            return;
        } else {
            printReverse(head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();                    // top = null; head = null (line 15)

        stack.pop();                                                                // Stack Underflow
        System.out.println("Is the stack empty? --> " + stack.isEmpty());
        System.out.println("The top most element is --> " + stack.peek());
        stack.push(100);
        System.out.println("Is the stack empty? --> " + stack.isEmpty());
        System.out.println("The top most element is --> " + stack.peek());
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        stack.display();
        System.out.println("Is the stack empty? --> " + stack.isEmpty());
        System.out.println("The top most element is --> " + stack.peek());

        System.out.println("First Pop -> " + stack.pop());                          // 500
        System.out.println("First Pop -> " + stack.pop());                          // 400
        stack.display();                                                            // 300 200 100
    }
}
