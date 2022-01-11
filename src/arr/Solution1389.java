package arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        int[] res = new int[len];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int pos = index[i];
            list.add(pos, nums[i]);
        }
        for (int i = 0; i < len; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
