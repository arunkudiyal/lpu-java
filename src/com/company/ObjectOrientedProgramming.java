package com.company;
// Template to create real-life entities
// java.util --> Java Collections | Java Wrapper Classes

// PARENT CLASS / super class to Test
class Demo {
    // class -> properties + methods

    // Data Members
    // Properties / Attributes :- Data declared in the class
    protected boolean sampleProperty;
    private int propertyZero;
    private int propertyOne;
    private String propertyTwo;

    // Constructor -> To initialise the values of the attributes
    // Two types -> 1. Default Constructor & 2. Parameterised Constructor
    Demo() {

    }

    Demo(int value0, int value1, String value2) {
        this.propertyZero = value0;
        this.propertyOne = value1;
        this.propertyTwo = value2;
    }

    // METHOD OVERLOADING -> It is a Compile Time Process (Compile-Time Polymorphism)
    // METHODS OVERRIDING -> It is a Run-Time Process (Run Time Polymorphism)
    public void display(String message) {
        System.out.println("The message says :- " + message);
    }

    // Member Functions
    // methods :- Functions declared & defined inside a class
    public void display() {
        System.out.println("Property One --> " + this.propertyOne);
        System.out.println("Property Two --> " + this.propertyTwo);
    }

    // Setters --> Methods which help you update the values of the private values from the class.
    public void setPropertyZero(int newPropertyZero) {
        this.propertyZero = newPropertyZero;
    }

    // Getters --> Methods which help you access the private values from the class.
    public int getPropertyZero() {
        return this.propertyZero;
    }

    public int getPropertyOne() {
        return this.propertyOne;
    }
}

// CHILD CLASS / sub class / derived class  of Demo
class Test extends Demo {
    int newProperty;

    Test() {

    }

    Test(int value) {
        this.newProperty = value;
    }

    public void display() {
        System.out.println("[Test]: The value is - " + newProperty);
    }
}

    //class Three extends Demo, Test {
    //
    //}

public class ObjectOrientedProgramming {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Create an Object / Instances (real-life entity) of the Demo class
        // Syntax :- ClassName objectName = new Constructor() :-> Name of the class & constructor are always same.
        // NOTE -> If you want to access attributes or methods from a class, create an object of the class
        // & access the attributes / methods by using . operator. Eg:- sc.nextInt();
        Demo myDemoOne = new Demo(50, 100, "String One");
        // System.out.println(myDemoOne);      // Memory Address -> Demo@28a418fc -> Heap Memory

        // Access the properties and methods from an object. --> using . operator
        // Syntax -> objectName.property OR objectName.method()
        // System.out.println("The value of Property One is " + myDemoOne.propertyOne);
        // System.out.println("The value of Property Two is " + myDemoOne.propertyTwo);
        // myDemoOne.display();
        // System.out.println("------ x ------");

        // myDemoOne.propertyOne = 150;     --> Cannot access (private) declared.
        // myDemoOne.display();

        // System.out.println("------ x ------");

        Demo myDemoTwo = new Demo(70, 200, "String Two");
        // myDemoTwo.display();

        // System.out.println("------ x ------");

        Demo myDemoThree = new Demo();
        // myDemoThree.display();

        // int ans = sum(myDemoOne.getPropertyZero(), myDemoOne.getPropertyOne());
        // System.out.println("The sum of the two private properties from the class is --> " + ans);

        // myDemoOne.setPropertyZero(10);

        // int newAns = sum(myDemoOne.getPropertyZero(), myDemoOne.getPropertyOne());
        // System.out.println("The updated sum of the two private properties from the class is --> " + newAns);

        // myDemoOne.display("This is a Demo myDemoOne Message!");

        Test myTest = new Test(1000);
        // myTest.sampleProperty = false;
        // myTest.display("[From Test Object] :- This is a message!");

        myDemoOne.display();
    }
}
