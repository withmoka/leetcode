package linkedlist;

public class Solution_0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode tmpA = headA;
        ListNode tmpB = headB;
        while (tmpA != null) {
            lenA++;
            tmpA = tmpA.next;
        }
        while (tmpB != null) {
            lenB++;
            tmpB = tmpB.next;
        }
        tmpA = headA;
        tmpB = headB;
        if (lenA < lenB) {
            int difference = lenB - lenA;
            for (int i = 0; i < difference; i++) {
                tmpB = tmpB.next;
            }
        } else {
            int difference = lenA - lenB;
            for (int i = 0; i < difference; i++) {
                tmpA = tmpA.next;
            }
        }
        ListNode cur = tmpA;
        while (tmpA != null && tmpB != null) {
            while (tmpA != null && tmpB != null && tmpB.val != tmpA.val) {
                tmpB = tmpB.next;
                tmpA = tmpA.next;
            }
            cur = tmpA;
            while (tmpA != null && tmpB != null && tmpA.val == tmpB.val) {
                tmpA = tmpA.next;
                tmpB = tmpB.next;
            }
        }
        if (cur == null) {
            return null;
        }
        return cur.next;
    }
}
