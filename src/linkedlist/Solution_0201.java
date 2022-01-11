package linkedlist;

import java.util.HashSet;

public class Solution_0201 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode tmp = head;
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(cur.val);
        while (cur.next != null) {
            if (!hashSet.contains(cur.next.val)) {
                cur = cur.next;
                hashSet.add(cur.val);
            } else {
                tmp = cur.next;
                while (tmp != null && hashSet.contains(tmp.val)) {
                    tmp = tmp.next;
                }
                cur.next = tmp;
            }
        }
        return head;
    }
}
