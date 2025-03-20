package org.sawaklaudia.recursion;

public class Factorial {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("for loop: ");
        System.out.println(calcFactorial(num));
        System.out.println("recursion: ");
        System.out.println(calcFactorialRecursively(num));
    }

    public static int calcFactorial(int num) {
        int result = 1;
        for (int i = num; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static int calcFactorialRecursively(int num) {
        if (num == 1) {
            return 1;
        }

        return num * calcFactorialRecursively(num - 1);
    }

}
