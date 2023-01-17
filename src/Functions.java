import java.util.Scanner;

class Demo {
    public void sum(int num1, int num2) {

    }
}

public class Functions {
    // FUNCTIONS :->
    // Block of code which can be re-used at any point of time in the code by simple calling the function.

    // Create a function
    // public static returnType functionName(parameters). Note -> returnType could be void if not returning anything.
    // arguments / parameters -> the dynamic values, which should be passed by the statement calling the function
    // Your functions will only be static if you are designing the function inside the same class where main is defined.
    public static int add(int num1, int num2) {
        int c = num1 + num2;
        return c;
    }

    public static void main(String[] args) {
        // Function Call
        // Q:- You are given with two numbers, your job is to find the square of the sum.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = add(a, b);
        System.out.println("The square of the sum of " + a + " and " + b + " is -> " + total * total);
    }
}
