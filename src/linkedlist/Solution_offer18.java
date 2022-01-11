package linkedlist;

public class Solution_offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode temp = head;
        while (temp.next != null && temp.next.val != val) {
            temp = temp.next;
        }
        if (temp.next == null) {
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }
}
