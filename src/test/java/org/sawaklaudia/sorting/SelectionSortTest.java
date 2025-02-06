package org.sawaklaudia.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

    private SortingAlgorithmI sortingAlgorithmI;

    @BeforeEach
    void setUp() {
        sortingAlgorithmI = new SelectionSort();
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

}