package org.sawaklaudia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate;

    @BeforeEach
    void setUp() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    void shouldReturnTrueWhenArrayContainsDuplicate() {
        // given
        int[] nums = {1, 2, 3, 1};

        // when
        boolean actual = containsDuplicate.containsDuplicate(nums);

        // then
        Assertions.assertTrue(actual);
    }

    @Test
    void shouldReturnFalseWhenArrayContainsNoDuplicates() {
        // given
        int[] nums = {1, 2, 3, 4};

        // when
        boolean actual = containsDuplicate.containsDuplicate(nums);

        // then
        Assertions.assertFalse(actual);
    }
}