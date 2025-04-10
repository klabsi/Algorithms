package org.sawaklaudia.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MergeSortTest {

    private SortingAlgorithmI sortingAlgorithmI;

    @BeforeEach
    void setUp() {
        sortingAlgorithmI = new MergeSort();
    }

    private static Stream<Arguments> providedData() {
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{1}, new int[]{1}),
                Arguments.of(new int[]{1, 3, 5, 4, 2, 0}, new int[]{0, 1, 2, 3, 4, 5}),
                Arguments.of(new int[]{0, 1, 2, 3, 4, 5}, new int[]{0, 1, 2, 3, 4, 5}),
                Arguments.of(new int[]{5, 4, 3, 2, 1, 0}, new int[]{0, 1, 2, 3, 4, 5}),
                Arguments.of(new int[]{1, 0, 5, 0, 2, 0}, new int[]{0, 0, 0, 1, 2, 5}),
                Arguments.of(new int[]{-1, -5, -2, -3, -6, -4}, new int[]{-6, -5, -4, -3, -2, -1})
        );
    }

    @ParameterizedTest
    @MethodSource("providedData")
    public void shouldSortArray(int[] toSort, int[] expected) {
        // given when
        int[] actual = sortingAlgorithmI.sort(toSort);

        // then
        Assertions.assertArrayEquals(expected, actual);
    }
}