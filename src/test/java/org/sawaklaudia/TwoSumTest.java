package org.sawaklaudia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    void testSolution1() {
        // given
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expected = {0,1};

        // when
        int[] actual = twoSum.twoSum(nums, target);

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testSolution2() {
        // given
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expected = {0,1};

        // when
        int[] actual = twoSum.twoSumSolution2(nums, target);

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testSolution3() {
        // given
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expected = {0,1};

        // when
        int[] actual = twoSum.twoSumWithHashMap(nums, target);

        // then
        Arrays.sort(expected);
        Arrays.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }
}