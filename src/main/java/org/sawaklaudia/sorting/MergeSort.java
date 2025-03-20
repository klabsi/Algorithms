package org.sawaklaudia.sorting;

import java.util.Arrays;

public class MergeSort implements SortingAlgorithmI {

    public static void main(String[] args) {
        int[] f = {1, 3};
        int[] s = {2, 4};
        int[] result = merge(f, s);
        System.out.println(Arrays.toString(result));
    }

    public static int[] merge(int[] f, int[] s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[f.length + s.length];

        while (i < f.length && j < s.length) {
            if (f[i] < s[j]) {
                result[k] = f[i];
                i++;
                k++;
            } else {
                result[k] = s[j];
                j++;
                k++;
            }
        }

        while (i < f.length) {
            result[k] = f[i];
            i++;
            k++;
        }

        while (j < s.length) {
            result[k] = s[j];
            j++;
            k++;
        }

        return result;
    }

    public int[] mergeSort(int[] toSort) {
        int[] left = Arrays.copyOfRange(toSort, 0, toSort.length / 2);
        int[] right = Arrays.copyOfRange(toSort, toSort.length / 2, toSort.length);

        if (left.length > 1) {
            left = mergeSort(left);
        }

        if (right.length > 1) {
            right = mergeSort(right);
        }

        return merge(left, right);
    }

    @Override
    public int[] sort(int[] toSort) {
        return mergeSort(toSort);
    }

}
