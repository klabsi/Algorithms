package org.sawaklaudia.recursion;

public class Fibonacci {
    // n = 5;
    // 0, 1, 1, 2, 3, 5

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
        System.out.println("recursion");
        System.out.println(fibonacciRec(n));
    }
    public static int fibonacci(int n) {
        int prev = 0;
        int last = 1;
        int sum = 0;

        if (n == 0) {
            return prev;
        }

        if(n == 1) {
            return last;
        }

        for(int i = 2; i <= n; i++) {
            sum = prev + last;
            prev = last;
            last = sum;
        }
        return sum;
    }

    public static int fibonacciRec(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }
}
