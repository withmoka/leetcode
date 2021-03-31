package training;

/**
 * 两数相加 pass
 */

import java.util.ArrayList;
import java.util.List;

public class Solution002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(l1.val + l2.val);
        ListNode cur = head;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while (temp1.next != null || temp2.next != null) {
            if(temp1.next!=null){
                temp1 = temp1.next;
            }else{
                temp1.next = new ListNode(0);
                temp1 = temp1.next;
            }
            if(temp2.next!=null){
                temp2 = temp2.next;
            }else{
                temp2.next = new ListNode(0);
                temp2 =  temp2.next;
            }
            cur.next = new ListNode(temp1.val + temp2.val + cur.val / 10);
            cur.val = cur.val % 10;
            cur = cur.next;
        }
        if (cur.val >= 10) {
            cur.next = new ListNode(cur.val / 10);
            cur.val = cur.val % 10;
        }
        return head;

    }
}
