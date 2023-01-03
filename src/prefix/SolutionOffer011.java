package prefix;

import java.util.HashMap;
import java.util.Map;

public class SolutionOffer011 {
    public static int findMaxLength(int[] nums) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        int[] pre = new int[nums.length + 1];
        for (int i = 1; i < pre.length; i++) {
            pre[i] = pre[i - 1] + nums[i - 1];
        }
        for (int i = 1; i < pre.length; i++) {
            if (!map.containsKey(pre[i])) {
                map.put(pre[i], i);
            } else {
                int len = i - map.get(pre[i]);
                max = Math.max(max, len);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0};
        int res = findMaxLength(arr);
        System.out.println(res);
    }
}
