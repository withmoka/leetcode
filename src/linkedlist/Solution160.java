package linkedlist;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lenA = 1;
        int lenB = 1;
        ListNode cal = headA;
        while (cal.next != null) {
            cal = cal.next;
            lenA++;
        }
        cal = headB;
        while (cal.next != null) {
            cal = cal.next;
            lenB++;
        }
        ListNode a = headA;
        ListNode b = headB;
        int dis = 0;
        if (lenA > lenB) {
            dis = lenA - lenB;
            for (int i = 0; i < dis; i++) {
                a = a.next;
            }
        } else {
            dis = lenB - lenA;
            for (int i = 0; i < dis; i++) {
                b = b.next;
            }
        }
        while (a != null && b != null) {
            if (a == b && a.val != 0) {
                return a;
            }
            a = a.next;
            b = b.next;
        }
        return null;
    }
}
