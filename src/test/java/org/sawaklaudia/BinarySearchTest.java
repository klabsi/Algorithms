package org.sawaklaudia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    private BinarySearch binarySearch;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    void shouldReturnExistingIndexWhenTargetOccursInArray() {
        //given
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int expected = 4;

        // when
        int actual = binarySearch.search(nums, target);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMinus1WhenTargetIsNotInArray() {
        //given
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int expected = -1;

        // when
        int actual = binarySearch.search(nums, target);

        // then
        Assertions.assertEquals(expected, actual);
    }
}