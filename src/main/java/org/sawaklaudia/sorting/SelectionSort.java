package org.sawaklaudia.sorting;

public class SelectionSort implements SortingAlgorithmI {

    @Override
    public int[] sort(int[] toSort) {
        int min = toSort[0];
        int minIndex = 0;

        for (int j = 0; j < toSort.length; j++) {
            min = Integer.MAX_VALUE;
            for (int i = j; i < toSort.length; i++) {
                if (min > toSort[i]) {
                    min = toSort[i];
                    minIndex = i;
                }
            }

            int temp = toSort[j];
            toSort[j] = min;
            toSort[minIndex] = temp;
        }

        return toSort;
    }
}
