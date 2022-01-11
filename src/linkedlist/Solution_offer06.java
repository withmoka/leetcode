package linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution_offer06 {
    public int[] reversePrint(ListNode head) {
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        int size = stack.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            ListNode temp = stack.pop();
            res[i] = temp.val;
        }
        return res;
    }
}
