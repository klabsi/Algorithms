package org.sawaklaudia.sorting;

import java.util.Arrays;

public class QuickSort implements SortingAlgorithmI {
    @Override
    public int[] sort(int[] toSort) {
        quickSort(toSort, 0, toSort.length - 1);
        return toSort;
    }

    public void quickSort(int[] toSort, int start, int end) {
        if(end <= start) return;

        int pivot = partition(toSort, start, end);
        quickSort(toSort, start, pivot - 1);
        quickSort(toSort, pivot + 1, end);
    }

    public int partition(int[] toSort, int start, int end) {
        int pivot = toSort[end];
        int i = start - 1;

        for(int j = start; j <= end; j++) {
            if(toSort[j] < pivot) {
                i++;
                int temp = toSort[i];
                toSort[i] = toSort[j];
                toSort[j] = temp;
            }
        }
        i++;
        int temp = toSort[i];
        toSort[i] = toSort[end];
        toSort[end] = temp;

        return i;
    }
}
