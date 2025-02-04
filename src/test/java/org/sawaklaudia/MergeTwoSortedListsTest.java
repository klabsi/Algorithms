package org.sawaklaudia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {

    private MergeTwoSortedLists mergeTwoSortedLists;

    @BeforeEach
    void setUp() {
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @Test
    void shouldReturnMergedListWhenBothNonEmptyLists() {
        // given
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1);

        // when
        ListNode actual = mergeTwoSortedLists.mergeTwoLists(list1, list2);

        // then
        Assertions.assertEquals(expected.val, actual.val);
    }

    @Test
    void shouldReturnEmptyListWhenBothEmptyLists() {
        // given
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode expected = new ListNode();

        // when
        ListNode actual = mergeTwoSortedLists.mergeTwoLists(list1, list2);

        // then
        Assertions.assertEquals(expected.val, actual.val);
    }

    @Test
    void shouldReturnNonEmptyListWhenOneEmptyList() {
        // given
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode(0);
        ListNode expected = new ListNode(0);

        // when
        ListNode actual = mergeTwoSortedLists.mergeTwoLists(list1, list2);

        // then
        Assertions.assertEquals(expected.val, actual.val);
    }
}