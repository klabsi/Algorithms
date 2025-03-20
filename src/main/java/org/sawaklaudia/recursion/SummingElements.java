package org.sawaklaudia.recursion;

import java.util.Random;

public class SummingElements {
    private static int length;

    public static void main(String[] args) {
        length = 10;
        int[] array = new Random().ints(50, 0, 234).toArray();

        System.out.println("for loop: ");
        System.out.println(sumElements(array));
        System.out.println("recursion: ");
        System.out.println(sumElementsRecursively(array, 0));
    }

    public static int sumElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int sumElementsRecursively(int[] array, int i) {
        if (i == length) {
            return 0;
        }

        int num = array[i];
        i++;
        return (sumElementsRecursively(array, i) + num);
    }
}
