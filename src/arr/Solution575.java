package arr;

import java.util.HashSet;
import java.util.Set;

public class Solution575 {
    public int distributeCandies(int[] candyType) {
        int len = candyType.length;
        Set<Integer> set = new HashSet<>();
        for (int ele : candyType) {
            set.add(ele);
        }
        return Math.min(len / 2, set.size());
    }
}
