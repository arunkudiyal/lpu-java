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

    public static int getNumberOfElements(LinkedList li) {
        int noOfElements = 0;
        if(head == null) return noOfElements;
        else {
           Node temp = head;
           while(temp.next != null) {
               noOfElements += 1;
               temp = temp.next;
           }
        }
        return  noOfElements + 1;
    }

    public static void printReverse(Node head) {
        // IF YOU CAN TAKE EXTRA MEMORY AS A ARRAY / ARRAY LIST :-->
        //        int n = getNumberOfElements(li);
        //        int[] arr = new int[n];
        //        int index = 0;
        //        Node temp = head;
        //        while(temp != null) {
        //            arr[index] = temp.data;
        //            index++;
        //            temp = temp.next;
        //        }
        //        for(int i = n-1; i >= 0; i--)
        //            System.out.print(arr[i] + " ");
        //        System.out.println();

        // If we can utilise the Stack memory of the RAM by using Recursion
        if(head == null) return;
        printReverse(head.next);
        System.out.print(head.data + " ");
    }

    public static LinkedList insertAtStart(LinkedList li, int data) {
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
        return li;
    }

    public static LinkedList insertAfter(LinkedList li, int data1, int data2) {
        Node newNode = new Node(data2);

        if(head == null) System.out.println("LinkedList does not exist!");
        // Trying to create 2nd Node of the LinkedList
        else if(head.data == data1) {
            Node nextNode = head.next;
            head.next = newNode;
            newNode.next = nextNode;
        } else {
            // Node to be inserted after (data1) exists in the middle or end of the LL
            Node prevNode = head;
            Node nextNode = head.next;
            while(prevNode.data != data1) {
                prevNode = nextNode;
                nextNode = nextNode.next;
            }
            if(prevNode == null) {
                System.out.println(data1 + " not found in the LL");
            } else {
                prevNode.next = newNode;
                newNode.next = nextNode;
            }
        }
        return li;
    }

    public static LinkedList insertAtEnd(LinkedList li, int data) {
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

    //    public static LinkedList deleteAtEnd(LinkedList li) {
    //        // If the LL is empty
    //        if(head == null) {
    //            System.out.println("Linked List Empty!");
    //        }
    //        // If LL only contains 2 Nodes
    //        else if(head.next.next == null) {
    //            head.next = null;
    //        }
    //        // If LL contains more than 2 more (3 ... n)
    //        else {
    //            Node temp = head;
    //            while(temp.next.next != null)
    //                temp = temp.next;
    //            temp.next = null;
    //        }
    //        return li;
    //    }

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

        insertAtEnd(li, 10);
        insertAtEnd(li, 20);
        insertAtEnd(li, 30);
        insertAtEnd(li, 40);
        insertAtEnd(li, 50);
        insertAtEnd(li, 60);
        insertAtEnd(li, 70);
        insertAtEnd(li, 80);
        insertAtEnd(li, 90);
        insertAtEnd(li, 100);

        li.display(li);                                                             // 10 20 30 40 50 60 70 80 90 100

        // deleteAtEnd(li);                                                         // 10 20 30 40
        // li.display(li);

        li.deleteFromKey(li, 60);
        li.display(li);                                                             // 10 20 30 40 50 70 80 90 100

        li.deleteFromKey(li, 10);
        li.display(li);                                                             // 20 30 40 50 70 80 90 100

        li.deleteFromKey(li, 100);
        li.display(li);                                                             // 20 30 40 50 70 80 90

        li.deleteFromKey(li, 200);
        li.display(li);                                                             // 20 30 40 50 70 80 90

        li.insertAtStart(li, 200);
        li.display(li);                                                             // 200 20 30 40 50 70 80 90

        li.insertAfter(li, 40, 100);
        li.display(li);                                                             // 200 20 30 40 100 50 70 80 90

        int n = li.getNumberOfElements(li);
        System.out.println("Total number of elements in the given LL is --> " + n); // 9

        // li.printReverse(li);                                                        // 90 80 70 50 100 40 30 20 200

        li.printReverse(head);                                                        // 90 80 70 50 100 40 30 20 200
        System.out.println();
    }
}
