package org.sawaklaudia.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    private SortingAlgorithmI sortingAlgorithmI;

    @BeforeEach
    void setUp() {
        sortingAlgorithmI = new QuickSort();
    }

    @Test
    public void shouldReturnEmptyArray() {
        // given
        int[] toSort = {};

        // when
        int[] actual = sortingAlgorithmI.sort(toSort);

        // then
        Assertions.assertArrayEquals(toSort, actual);
    }

    @Test
    public void shouldSortOneElementArray() {
        // given
        int[] toSort = {1};

        // when
        int[] actual = sortingAlgorithmI.sort(toSort);

        // then
        Assertions.assertArrayEquals(toSort, actual);
    }

    @Test
    public void shouldSortUnsortedArray() {
        // given
        int[] toSort = {1, 3, 5, 4, 2, 0};
        int[] expected = {0, 1, 2, 3, 4, 5};

        // when
        int[] actual = sortingAlgorithmI.sort(toSort);

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAlreadySortedArray() {
        // given
        int[] toSort = {0, 1, 2, 3, 4, 5};
        int[] expected = {0, 1, 2, 3, 4, 5};

        // when
        int[] actual = sortingAlgorithmI.sort(toSort);

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testReversedArray() {
        // given
        int[] toSort = {5, 4, 3, 2, 1, 0};
        int[] expected = {0, 1, 2, 3, 4, 5};

        // when
        int[] actual = sortingAlgorithmI.sort(toSort);

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortArrayWithDuplicates() {
        // given
        int[] toSort = {1, 0, 5, 0, 2, 0};
        int[] expected = {0, 0, 0, 1, 2, 5};

        // when
        int[] actual = sortingAlgorithmI.sort(toSort);

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortArrayWithNegativeNumbers() {
        // given
        int[] toSort = {-1, -5, -2, -3, -6, -4};
        int[] expected = {-6, -5, -4, -3, -2, -1};

        // when
        int[] actual = sortingAlgorithmI.sort(toSort);

        // then
        Assertions.assertArrayEquals(expected, actual);
    }
}