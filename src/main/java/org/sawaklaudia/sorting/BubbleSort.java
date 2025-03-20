package org.sawaklaudia.sorting;

import static org.sawaklaudia.sorting.Swap.swap;

public class BubbleSort implements SortingAlgorithmI {

    @Override
    public int[] sort(int[] toSort) {
        for (int i = 0; i < toSort.length - 1; i++) {
            for (int j = 0; j < toSort.length - 1 - i; j++) {
                if (toSort[j] > toSort[j + 1]) {
                    swap(toSort, j, j + 1);
                }
            }
        }
        return toSort;
    }
}
