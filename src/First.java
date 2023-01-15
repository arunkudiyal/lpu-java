// Java Package --> java.lang
// Java Primitive Data Types
import java.util.Scanner;
class First {
    // If you want to create a java executable file, you should have a main method
    /*
    * Multi
    * Line
    * Comments
    * */
    public static void main(String[] args) {
        // Primitive Data Types --> to store & manage diff types if data
        // roll number, name, percent, scores, isGraduate ...
        // storing the data -> variables
        // Syntax --> dataType variableName = constantValue;

        // Primitive Data Types -->
        // 1. byte -> -128 to 127
//        byte var1 = 127;
//        System.out.println(var1);
//
//        // 2. short -> -32,768 to +32,767
//        short var2 = 32767;
//        System.out.println(var2);
//
//        // 3. int -> -2^31 to 2^31-1
//        int var3 = 1000000000;
//        System.out.println(var3);
//
//        // 4. long -> -2^63 to 2^63-1
//        long var4 = 1000000000064747532L;
//        System.out.println(var4);
//
//        // 5. boolean - true/false
//        boolean isCool = false;
//        System.out.println(isCool);
//
//        // 6. char -> ' ' -> single quotes
//        // char values can also hold number values
//        // A-Z --> 65 to 91
//        // a-z --> 97 to 122
//        char ch = 'c';
//        System.out.println(ch);
//
//        // 7. float -> real.decimal --> 3.14 --> 7 decimal places
//        float pi = 3.14159265359f;
//        System.out.println(pi);
//
//        // 8. double -> real.decimal --> 16 decimal places
//        double pi2 = 3.14159265359123456789;
//        System.out.println(pi2);


        // CONDITIONAL STATEMENTS -> that when you want to execute a piece of code based on a condition (produce T/F)
        // if, else, else if
//        if(condition) {
//            // True statements
//        } else {
//            // false Statemenent
//        }

//        if(10 < 100) {
//            System.out.println("Print 1");
//        } else {
//            System.out.println("Print 2");
//        }


        // VOTING SYSTEM :-->
        // gender = 'M' / 'F'
        // gender -> 'M', age >= 21; then he can vote
        // gender -> 'F', age >= 18; then she can vote
//        char gender = 'O';
//        byte age = 30;
//
//        if(gender == 'F') {
//            // check the age
//            if(age >= 18) {
//                System.out.println("She can vote!");
//            } else {
//                System.out.println("She cannot vote!");
//            }
//        } else if(gender == 'M') {
//            if(age >= 21) {
//                System.out.println("He can vote!");
//            } else {
//                System.out.println("He cannot vote!");
//            }
//        } else {
//            System.out.println("Invalid Input!!");
//        }


        // Logical Gates --> AND, OR, NOT

        // AND Gate ->
        // i/p A    i/p B   o/p
        // F        F       F
        // F        T       F
        // T        F       F
        // T        T       T
//        if( (10 > 100) && (20 < 100) ) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }


        // OR Gate ->
        // i/p A    i/p B   o/p
        // F        F       F
        // F        T       T
        // T        F       T
        // T        T       T
//        if( (10 > 100) || (20 < 100) ) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        // NOT Gate ->
        // i/p A    o/p
        // F         T
        // T         F
//        if( !(100 < 1) ) {
//            System.out.println("False");
//        } else {
//            System.out.println("True");
//        }

        // string = "Hello";
        //       [0, 1, 2, 3, 4]
        //str = ['H', 'e', 'l', 'l', 'o'];

        // Q.1 -> You are given with a user number input, your job is to verify is the i/p is +ve, -ve or zero, and print it.

        // create the object of the Scanner class
        // SYNTAX -> ClassName objectName = new ClassName();
//        Scanner sc = new Scanner(System.in);
//        // Those object comes preloaded with pre-defined functions(methods) .
//        int input_number = sc.nextInt();
//        if(input_number > 0) {
//            System.out.println("It is a +ve Number");
//        } else if(input_number < 0) {
//            System.out.println("It is a -ve Number");
//        } else {
//            System.out.println("It is a 0 Number");
//        }


        // Q.2 -> You are given with an integer i/p, based on the input, evaluate if the input_number is even or odd.
//        Scanner sc = new Scanner(System.in);
//        int input_number = sc.nextInt();        // 50
//
//        // int output = input_number / 2;          // Division Operator (/) - Quotient
//        int remainder = input_number % 2;          // Modulus Operator (%) - Remainder
//
//        // for any even no, division by 2, yields remainder 0
//        // any number when divided by 2 yielding remainder 0, is an even number
//        if(remainder == 0) {
//            System.out.println("Number is EVEN");
//        } else {
//            System.out.println("Number is ODD");
//        }

        // Q.3 -> You are given with a character i/p, you are supposed to check if that i/p is a vowel or consonant.
//        Scanner sc = new Scanner(System.in);
//        char myChar = sc.next().charAt(0);
//
//        // a, e, i, o, u + A, E, I, O, U
//        if(myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u' || myChar == 'A' || myChar == 'E' || myChar == 'I' || myChar == 'O' || myChar == 'U' ) {
//            System.out.println("Vowels");
//        } else {
//            System.out.println("Consonant");
//        }

        // TYPECASTING..

        // LOOPS --->
        // 1. for loop -
        // Q :- what is the purest form of a for loop ===> for(;;)
        // for(declaration + initialization(start); condition(meet for the end); inc/dec)

        // print real nos from 1 to 51
//        int i;
//        for(i=1; i <= 51; i+=1) {
//            System.out.print(i + ", ");
//        }
//        System.out.println();

//        for(int i=1; i <= 51; i+=1) {
//            System.out.print(i + ", ");
//        }
//        System.out.println();

        // Q:- Given a number, print the standard table for the number (till 10).
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // start - number; end - number * 10; inc/dec - variable + number
//        for(int i=number; i <= number*10; i += number) {
//            System.out.println(number + " x " + i/7 + " = " + i);
//        }

        // start = 1, end - 10
        for(int i=1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number*i);
        }

        // PATTERN PRINTING & WHILE LOOPS
    }
}