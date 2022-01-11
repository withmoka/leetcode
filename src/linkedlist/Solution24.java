package linkedlist;

public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode pre = head.next;
        ListNode suc = head.next.next;
        head.next.next = head;
        head.next = swapPairs(suc);
        return pre;
    }
}
