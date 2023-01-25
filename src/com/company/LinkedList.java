package com.company;

class Node {
    // Data Part
    int data;
    // Address Part
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Create an object of the object --> Node newNode = new Node(1000);

public class LinkedList {
    static Node head;

    LinkedList() {
        head = null;
    }

    public static LinkedList insert(LinkedList li, int data) {
        Node newNode = new Node(data);
        // If I am inserting the first element, head will be null
        if(head == null) {
            head = newNode;
        } else {
            // If I am inserting value to an already existing LL

            // Create a temp node, and place that temp at the end of LL.
            Node temp = head;
            while(temp.next != null)
                // Take you from head to the last elt of the LL.
                temp = temp.next;
            // The moment I reach to the last elt, I will change the next to the newNode
            temp.next = newNode;
        }
        return li;
    }

    public static void display(LinkedList li) {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data + " at the address of " + temp);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        // The moment your LL is created, no data will be there & head = null
        LinkedList li = new LinkedList();

        insert(li, 10);
        insert(li, 20);
        insert(li, 30);
        insert(li, 40);
        insert(li, 50);

        li.display(li);
    }
}
