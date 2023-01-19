// Template to create real-life entities
class Demo {
    // class -> properties + methods

    // Properties / Attributes :- Data declared in the class
    int propertyOne;
    String propertyTwo;

    // Constructor -> To initialise the values of the attributes
    // Two types -> 1. Default Constructor & 2. Parameterised Constructor
    Demo() {

    }

    Demo(int value1, String value2) {
        propertyOne = value1;
        propertyTwo = value2;
    }

    // methods :- Functions declared & defined inside a class
    public void display() {
        System.out.println("Property One --> " + propertyOne);
        System.out.println("Property Two --> " + propertyTwo);
    }
}

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // Create an Object / Instances (real-life entity) of the Demo class
        // Syntax :- ClassName objectName = new Constructor() :-> Name of the class & constructor are always same.
        // NOTE -> If you want to access attributes or methods from a class, create an object of the class
        // & access the attributes / methods by using . operator. Eg:- sc.nextInt();
        Demo myDemoOne = new Demo(100, "String One");
        // System.out.println(myDemoOne);      // Memory Address -> Demo@28a418fc -> Heap Memory

        // Access the properties and methods from an object. --> using . operator
        // Syntax -> objectName.property OR objectName.method()
        // System.out.println("The value of Property One is " + myDemoOne.propertyOne);
        // System.out.println("The value of Property Two is " + myDemoOne.propertyTwo);
        myDemoOne.display();
        System.out.println("------ x ------");

        myDemoOne.propertyOne = 150;
        myDemoOne.display();

        System.out.println("------ x ------");

        Demo myDemoTwo = new Demo(200, "String Two");
        myDemoTwo.display();

        System.out.println("------ x ------");

        Demo myDemoThree = new Demo();
        myDemoThree.display();
    }
}
