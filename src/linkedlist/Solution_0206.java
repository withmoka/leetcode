package linkedlist;

public class Solution_0206 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode pre = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }
        ListNode temp = head;
        while (temp != null && pre != null) {
            if (temp.val != pre.val) {
                return false;
            }
            temp = temp.next;
            pre = pre.next;
        }
        return true;
    }
}
