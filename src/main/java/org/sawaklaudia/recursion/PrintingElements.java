package org.sawaklaudia.recursion;

import java.util.Random;

public class PrintingElements {

    public static void main(String[] args) {
        int[] array = new Random().ints(50, 0, 234).toArray();

        System.out.println("for loop:");
        printElementsFromArray(array);
        System.out.println("\n recursion:");
        printElementsFromArrayRecursively(array, 0);
    }

    public static void printElementsFromArray(int[] array) {
        for (int i = 0; i < 50; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void printElementsFromArrayRecursively(int[] array, int i) {
        if (i == 50) {
            return;
        }

        System.out.print(array[i] + ", ");
        i++;
        printElementsFromArrayRecursively(array, i);
    }
}
