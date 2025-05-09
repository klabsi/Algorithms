package org.sawaklaudia.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    private HouseRobber houseRobber;

    @BeforeEach
    void setUp() {
        houseRobber = new HouseRobber();
    }

    @Test
    void should() {
        // given
        int[] houses = {2,7,9,3,1};
        int expected = 12;
        // when
        int actual = houseRobber.robTab(houses);

        // then
        Assertions.assertEquals(expected, actual);
    }
}