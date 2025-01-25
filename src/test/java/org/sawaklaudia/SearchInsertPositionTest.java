package org.sawaklaudia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SearchInsertPositionTest {

    private SearchInsertPosition searchInsertPosition;

    @BeforeEach
    void setUp() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    void shouldReturnIndexWhenTargetExistsInArray() {
        // given
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int expected = 2;

        // when
        int actual = searchInsertPosition.searchInsert(nums, target);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnInsertionIndexWhenTargetIsSmallerThanSomeElements() {
        // given
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int expected = 1;

        // when
        int actual = searchInsertPosition.searchInsert(nums, target);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnLastIndexWhenTargetIsGreaterThanAllElements() {
        // given
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int expected = 4;

        // when
        int actual = searchInsertPosition.searchInsert(nums, target);

        // then
        Assertions.assertEquals(expected, actual);
    }
}