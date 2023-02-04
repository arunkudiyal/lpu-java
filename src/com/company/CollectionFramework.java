package com.company;
// import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

// java.util --> Collection of classes & interfaces which helps you use the common Data Structures.
public class CollectionFramework {
    public static void main(String[] args) {
        // 1. default constructor -> will create a LL, but the LL will be empty by default.
        LinkedList<Integer> li = new LinkedList<Integer>();
        System.out.println(li);


        //        ArrayList<Integer> al = new ArrayList<>();
        //        al.add(100);
        //        al.add(200);
        //        al.add(300);
        //        al.add(400);
        //        al.add(500);
        //        System.out.println(al);
        //
        //        // 2. parameterized constructor ->
        //        LinkedList<Integer> li2 = new LinkedList<>(al);
        //        System.out.println("Newly Created LinkedList is - " + li2);

        // addAtEnd(int)
        li.addLast(100);
        li.addLast(200);
        li.addLast(300);
        li.addLast(400);
        li.addLast(500);
        System.out.println(li);

        // addAtStart(int)
        li.addFirst(50);
        System.out.println(li);

        System.out.println("Head of the LinkedList - " + li.peek());

        // addEnd() & add() works in the same way where you append an element at the end of the LL
        li.add(600);
        System.out.println(li);                                         // [50, 100, 200, 300, 400, 500, 600]

        // addAtTheMiddle()
        li.add(1, 75);
        System.out.println(li);                                         // [50, 75, 100, 200, 300, 400, 500, 600]

        // contains() -> returns a boolean value to check if any elt is available in the LL
        System.out.println("50 is available in the LL - " + li.contains(50));
        System.out.println("80 is available in the LL - " + li.contains(80));

        // PRINT -> 50 75 100 200 300 400 500 600
        ListIterator itr = li.listIterator();
        // Move in the --> direction --> hasNext() --> boolean value to tell if elts are available next for every iteration
        while(itr.hasNext())
            System.out.print(itr.next() + " ");
        System.out.println();

        // 600 500 400 300 200 100 75 50
        System.out.println("List in the reverse order is :-");
        // Q:- Given a LL, reverse print the elements of the LL.
        Iterator itr2 = li.descendingIterator();
        while(itr2.hasNext())
            System.out.print(itr2.next() + " ");
        System.out.println();

        // Returns the index of the specified element & -1 if the elt does not exist.
        System.out.println("Index of elt 2 is - " + li.indexOf(80));

        // removeFromTheStart() --> Return & Remove the head (first elt.) of the LL
        System.out.println("Deleted Element - " + li.poll());
        System.out.println(li);                                             // [75, 100, 200, 300, 400, 500, 600]


        // remove()
        System.out.println(li.remove(4));
        System.out.println(li);                                             // // [75, 100, 200, 300, 500, 600]

        // If you want to convert your LinkedList into an Array
        // int[] arr = new int[10]
        Integer[] arr = new Integer[li.size()];
        // SYNTAX -> li.toArray(yourArray);
        li.toArray(arr);

        // Printing the values of the array -
        for(int i=0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}