package arr;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
            int len = num.length;
            int lastNum = k;
            LinkedList<Integer> ret = new LinkedList<>();
            int i = len - 1;
            while (i >= 0 || lastNum > 0) {
                if (i >= 0) {
                    lastNum += num[i];
                }
                ret.addFirst(lastNum % 10);
                lastNum /= 10;
                i--;
            }
            return ret;
    }
}
