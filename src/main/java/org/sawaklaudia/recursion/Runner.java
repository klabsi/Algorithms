package org.sawaklaudia.recursion;

public class Runner {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("print all el with for loop: ");
        printAllElements(arr);
        System.out.println("\n print all el with recursion: ");
        printAllRec(arr, 0);
        System.out.println("sum with for loop: ");
        System.out.println(sumAllElements(arr));
        System.out.println("\n sum with recursion: ");
        System.out.println(sumAllRec(arr, 0, 0));
        System.out.println("\n sum with tail recursion: ");
        System.out.println((sumAllTailRec(arr, 0)));
    }

    public static void printAllElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    // index  0, 1, 2, 3, 4, 5, 6
    //      [ 1, 2, 3, 4, 5, 6, 7 ]
    public static void printAllRec(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        i = i + 1;
        printAllRec(arr, i);
    }

    public static int sumAllElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int sumAllRec(int[] arr, int i, int sum) {
        if (i == arr.length) {
            return sum;
        }
        sum += arr[i];
        i++;
        return sumAllRec(arr, i, sum);
    }

    public static int sumAllTailRec(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }
        int element = arr[i];
        i++;
        return element + sumAllTailRec(arr, i);
    }
}
