package arr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution846 {
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        int len = hand.length;
        if (len % groupSize != 0) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        for (int ele : hand) {
            list.add(ele);
        }
        Collections.sort(list);
        while (list.size() != 0) {
            int a = list.get(0);
            for (int i = a; i < a + groupSize; i++) {
                boolean not_exist = true;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) == i) {
                        not_exist = false;
                        list.remove(j);
                    }
                    if (not_exist==false){
                        break;
                    }
                }
                if (not_exist) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] hand = new int[]{1,2,2,3,3,3,4,4,5};
        int groupSize = 3;
        boolean res = isNStraightHand(hand, groupSize);
        System.out.println(res);
    }
}
