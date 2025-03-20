package org.sawaklaudia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers;

    @BeforeEach
    void setUp() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    void shouldAddTwoNumbersWhereTensOccurs() {
        // given
        ListNode l1 = new ListNode(5, new ListNode(3));
        ListNode l2 = new ListNode(6, new ListNode(6));
        ListNode expected = new ListNode(1, new ListNode(0, new ListNode(1)));

        // when
        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldAddTwoNumbers() {
        // given
        ListNode l1 = new ListNode(2, new ListNode(3));
        ListNode l2 = new ListNode(6, new ListNode(6));
        ListNode expected = new ListNode(8, new ListNode(9));

        // when
        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);

        // then
        Assertions.assertEquals(expected, actual);
    }

}