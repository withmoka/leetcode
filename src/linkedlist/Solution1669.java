package linkedlist;

public class Solution1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode pre = list1;
        for (int i = 0; i < a - 1; i++) {
            pre = pre.next;
        }
        ListNode suc = list1;
        for (int i = 0; i < b + 1; i++) {
            suc = suc.next;
        }
        pre.next = list2;
        while (pre.next != null) {
            pre = pre.next;
        }
        pre.next = suc;
        return list1;
    }
}
