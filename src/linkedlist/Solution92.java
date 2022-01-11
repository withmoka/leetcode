package linkedlist;

public class Solution92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //如果只有1个结点（题目规定至少1个），结果就是这个结点
        if (head.next == null) {
            return head;
        }
        //虚拟结点一般用-1初始化
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        //pre指向反转子链表左结点的前一个结点
        ListNode pre = newHead;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        //rightNode指向反转子链表的右结点
        ListNode rightNode = newHead;
        for (int i = 0; i < right; i++) {
            rightNode = rightNode.next;
        }
        ListNode leftNode = pre.next;
        ListNode suc = rightNode.next;

        pre.next = null;
        rightNode.next = null;

        //用4个指针作标记，切断连接

        reverseList(leftNode);
        pre.next = rightNode;
        leftNode.next = suc;
        return newHead.next;
    }

    //反转链表的结果可以返回也可以不返回
    public void reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }
}
