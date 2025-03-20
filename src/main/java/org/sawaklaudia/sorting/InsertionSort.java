package org.sawaklaudia.sorting;

public class InsertionSort implements SortingAlgorithmI {
    @Override
    public int[] sort(int[] toSort) {
        for (int i = 1; i < toSort.length; i++) {
            int elementToInsert = toSort[i];
            int j = i - 1;
            while (j >= 0 && toSort[j] > elementToInsert) {
                toSort[j + 1] = toSort[j];
                j--;
            }
            toSort[j + 1] = elementToInsert;
        }
        return toSort;
    }
}
