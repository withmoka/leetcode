package linkedlist;

public class Solution_0207Demo {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        boolean AHasFinded = false;
        boolean BHasFinded = false;
        if(tempA == null || tempB == null){
            return null;
        }
        while(tempA != tempB){
            if(tempA.next == null){
                if(AHasFinded){
                    return null;
                }
                tempA = headB;
                AHasFinded = true;
            }else{
                tempA = tempA.next;
            }
            if(tempB.next == null){
                if(BHasFinded){
                    return null;
                }
                tempB = headA;
                BHasFinded = true;
            }else{
                tempB = tempB.next;
            }
        }
        return tempA;
    }
}