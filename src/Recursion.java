import java.util.Scanner;

public class Recursion {
    public static int fib_iterative(int n) {
        int first = 0;
        int second = 1;
        for(int i=2; i < n; i++) {
            int temp = second;
            second = first + second;
            first = temp;
        }
        return  second;
    }

    public static int fib_recursive(int n) {
        // Base Case
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        else
            return fib_recursive(n-1) + fib_recursive(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // The term of the fib series.
        int n = sc.nextInt();
        int fibValue = fib_recursive(n);
        System.out.println(fibValue);
    }
}
