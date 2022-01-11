package linkedlist;

public class Solution876 {
    public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        len /= 2;
        cur = head;
        for (int i = 0; i < len; i++) {
            cur = cur.next;
        }
        return cur;
    }
}
