package org.sawaklaudia;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(-1);
        ListNode draft = list3;

        while(list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                draft.next = list1;
                list1 = list1.next;
            } else {
                draft.next = list2;
                list2 = list2.next;
            }
            draft = draft.next;
        }

        if(list1 != null) {
            draft.next = list1;
        } else {
            draft.next = list2;
        }
        return list3.next;
    }

    private void printListNode(ListNode listNode) {
        while (listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}