package arr;

import java.util.HashSet;
import java.util.Set;

public class Solution260 {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                set.remove(num);
            }
        }
        int[] ans = new int[2];
        int i = 0;
        for (int ele : set) {
            ans[i++] = ele;
        }
        return ans;
    }
}
