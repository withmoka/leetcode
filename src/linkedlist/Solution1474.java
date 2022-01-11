package linkedlist;

public class Solution1474 {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode cur = head;
        ListNode tmp = head;
        while (cur != null) {
            for (int i = 0; i < m - 1 && cur != null; i++) {
                cur = cur.next;
            }
            if (cur == null) {
                break;
            }
            tmp = cur;
            for (int j = 0; j < n + 1 && tmp != null; j++) {
                tmp = tmp.next;
            }
            cur.next = tmp;
            cur = tmp;
        }
        return head;
    }
}
