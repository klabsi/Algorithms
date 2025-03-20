package org.sawaklaudia;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list3 = new ListNode();
        ListNode head3 = list3;
        int sum;
        int rest;
        int tens = 0;
        while (l1 != null || l2 != null || tens != 0) {
            sum = tens;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            tens = sum / 10;
            rest = sum % 10;
            list3.next = new ListNode(rest);
            list3 = list3.next;
        }

        return head3.next;
    }
}
