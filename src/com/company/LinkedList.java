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

    public static LinkedList deleteFromKey(LinkedList li, int key) {
        // Case 1 --> If the LL does not exist
        if(head == null) {
            System.out.println("Linked List Empty!");
        }
        // Case 2 --> If the data exists in the head
        if(head.data == key) {
            Node curr = head.next;
            head = curr;
        }
        // Case 3 --> If the key does not exist or key was found and removed.
        else {
            Node curr = head;
            Node prev = null;
            while(curr.data != key && curr.next != null) {
                prev = curr;
                curr = curr.next;
            }
            // Delete from the end
            if(curr.data == key && curr.next == null) {
                prev.next = null;
            }
            if(curr.next != null) {
                // System.out.println(curr.data + " got deleted");
                prev.next = curr.next;
            }
            if(curr == null) {
                System.out.println(key + " was not found in the Linked List");
            }
        }
        return li;
    }

    public static LinkedList deleteAtEnd(LinkedList li) {
        // If the LL is empty
        if(head == null) {
            System.out.println("Linked List Empty!");
        }
        // If LL only contains 2 Nodes
        else if(head.next.next == null) {
            head.next = null;
        }
        // If LL contains more than 2 more (3 ... n)
        else {
            Node temp = head;
            while(temp.next.next != null)
                temp = temp.next;
            temp.next = null;
        }
        return li;
    }

    public static void display(LinkedList li) {
        Node temp = head;
        // while(temp.next != null) {}      --> Write an individual print statement for the last node.
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // The moment your LL is created, no data will be there & head = null
        LinkedList li = new LinkedList();

        insert(li, 10);
        insert(li, 20);
        insert(li, 30);
        insert(li, 40);
        insert(li, 50);
        insert(li, 60);
        insert(li, 70);
        insert(li, 80);
        insert(li, 90);
        insert(li, 100);

        li.display(li);                     // 10 20 30 40 50 60 70 80 90 100

        // deleteAtEnd(li);                 // 10 20 30 40
        // li.display(li);

        li.deleteFromKey(li, 60);
        li.display(li);                     // 10 20 30 40 50 70 80 90 100

        li.deleteFromKey(li, 10);
        li.display(li);                     // 20 30 40 50 70 80 90 100

        li.deleteFromKey(li, 100);
        li.display(li);                     // 20 30 40 50 70 80 90

        li.deleteFromKey(li, 200);
        li.display(li);                     // 20 30 40 50 70 80 90
    }
}
