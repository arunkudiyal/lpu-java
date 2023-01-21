package com.company;

class A {
    public void show() {
        System.out.println("Message Printed -- [A]");
    }
}

class B extends A {
    public void show() {
        System.out.println("Message Printed -- [B]");
    }
}

public class Example {
    public static void main(String[] args) {
        // METHOD OVERRIDING

        A a;
        // Initilize it with the parent constructor
        a = new A();
        // show is from the parent class.
        a.show();
        // Initilize it with the child constructor
        a = new B();
        // show is from the child class.
        a.show();

        // Address of the object 'b'
        System.out.println(a);          // com.company.B@5305068a
    }
}
