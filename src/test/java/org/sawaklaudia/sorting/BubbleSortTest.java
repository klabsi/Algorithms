package org.sawaklaudia.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    private SortingAlgorithmI sortingAlgorithmI;

    @BeforeEach
    void setUp() {
        sortingAlgorithmI = new BubbleSort();
    }

    @Test
    void shouldSortArray() {
        // given
        int[] tab = {40, 12, 99, 83, 11, 0, 27};

        // when
        int[] actual = sortingAlgorithmI.sort(tab);

        // then
        for (int i = 0; i < actual.length - 1; i++) {
            Assertions.assertTrue(actual[i] <= actual[i + 1]);
        }
    }

    @Test
    void shouldSortArrayEx2() {
        // given
        int[] tab = {1, 2, 5, 4, 10, 10, -1, 5};

        // when
        int[] actual = sortingAlgorithmI.sort(tab);

        // then
        for (int i = 0; i < actual.length - 1; i++) {
            Assertions.assertTrue(actual[i] <= actual[i + 1]);
        }
    }

    @Test
    void shouldSortArrayEx3() {
        // given
        int[] tab = {-5, 7, -2, -5, -100, 100, 52, 150};

        // when
        int[] actual = sortingAlgorithmI.sort(tab);

        // then
        for (int i = 0; i < actual.length - 1; i++) {
            Assertions.assertTrue(actual[i] <= actual[i + 1]);
        }
    }

    @Test
    void shouldSortArrayEx4() {
        // given
        int[] tab = {5, 0, 0, 0, 1, -1};

        // when
        int[] actual = sortingAlgorithmI.sort(tab);

        // then
        for (int i = 0; i < actual.length - 1; i++) {
            Assertions.assertTrue(actual[i] <= actual[i + 1]);
        }
    }

    @Test
    void shouldSortArrayEx5() {
        // given
        int[] tab = {0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0};

        // when
        int[] actual = sortingAlgorithmI.sort(tab);

        // then
        for (int i = 0; i < actual.length - 1; i++) {
            Assertions.assertTrue(actual[i] <= actual[i + 1]);
        }
    }
}