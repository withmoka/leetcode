package linkedlist;

public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode res = head;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                res.next = temp1;
                temp1 = temp1.next;
                res = res.next;
            } else {
                res.next = temp2;
                temp2 = temp2.next;
                res = res.next;
            }
        }
        if (temp1 == null) {
            res.next = temp2;
        }
        if (temp2 == null) {
            res.next = temp1;
        }
        return head.next;
    }
}
