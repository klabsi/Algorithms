package org.sawaklaudia.recursion;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchRec {
    private static int length = 100;

    public static void main(String[] args) {
        int[] array = new Random().ints(length, 1, 462).toArray();
        int searchedNumber = array[new Random().nextInt(length)];
        Arrays.sort(array);

        System.out.println("for loop: ");
        System.out.println(binarySearch(array, searchedNumber));
        System.out.println("recursion: ");
        System.out.println(binarySearchRecursively(array, searchedNumber, 0, length - 1));
    }

    public static int binarySearch(int[] array, int searchedNumber) {
        int leftIndex = 0;
        int rightIndex = length - 1;

        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            if (array[middleIndex] == searchedNumber) {
                return middleIndex;
            } else if (array[middleIndex] <= searchedNumber) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }

        return -1;
    }

    public static int binarySearchRecursively(int[] array, int searchedNumber, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return -1;
        }

        int middleIndex = (leftIndex + rightIndex) / 2;
        if (array[middleIndex] == searchedNumber) {
            return middleIndex;
        } else if (array[middleIndex] <= searchedNumber) {
            return binarySearchRecursively(array, searchedNumber, middleIndex + 1, rightIndex);
        } else {
            return binarySearchRecursively(array, searchedNumber, leftIndex, middleIndex - 1);
        }
    }

}
