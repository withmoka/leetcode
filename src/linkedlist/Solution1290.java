package linkedlist;

public class Solution1290 {
    public int getDecimalValue(ListNode head) {
        ListNode cur = head;
        int sum = 0;
        while (cur != null) {
            sum = sum * 2;
            sum = sum + cur.val;
            cur = cur.next;
        }
        return sum;
    }
}
