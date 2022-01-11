package linkedlist;

public class Solution_offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        int len = 0;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        cur = head;
        for (int i = 0; i < len - k; i++) {
            cur = cur.next;
        }
        return cur;
    }
}
