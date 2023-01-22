package com.company;
import java.util.ArrayList;

// Java Collections --> Collection of classes & interfaces which helps you to perform data-manipulation very easily.

public class MyCollections {
    public static void main(String[] args) {
        // Object of the Collection class --> They do not work on PDT | Wrapper Classes
        // Syntax --> ClassName<WrapperClass> objectName = new Constructor<WrapperClass>();
        // int[] al = new int[5];
        ArrayList<Integer> al = new ArrayList<Integer>(5);

        // 1. Insert values in the ArrayList --> add(item)
        // al[0] = 10; al[1] = 20, ...
        boolean ans = al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);

        // get(index) --> value at that index
        System.out.println("The value at index 0 in the Arraylist is - " + al.get(0));

        al.add(3, 350);

        // Object returns the value of the al rather than the address.
        System.out.println(ans);
        System.out.println(al);

        // size of the arrayList - size()
        System.out.println("The total length of the ArrayList is " + al.size());

        // remove the element from the arrayList --> 'int'
        Integer deletedEle = al.remove(0);
        System.out.println(deletedEle + " was removed successfully!");
        System.out.println(al);

        // al.add(99, 1000); --> Won't work ( index < size() )
        System.out.println(al);

        // clear() -> Delete all the elements from the ArrayList
        al.clear();
        System.out.println(al);
    }
}
