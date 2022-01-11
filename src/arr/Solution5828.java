package arr;

import java.util.ArrayList;
import java.util.List;

public class Solution5828 {
    public int minSpaceWastedKResizing(int[] nums, int k) {
        //一共有len个元素
        int len = nums.length;
        return -1;
    }

    // 前p个元素中最大值
    public int preMax(int[] nums, int p) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < p; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    //后q个元素中最大值
    public int suffixMax(int[] nums, int q) {
        int max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i > nums.length - 1 - q; i--) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    // 前p个元素的和
    public int pre(int[] nums, int p) {
        int[] res = new int[nums.length + 1];
        for (int i = 1; i < nums.length + 1; i++) {
            res[i] = res[i - 1] + nums[i];
        }
        return res[p];
    }

    // 后q个元素的和
    public int suffix(int[] nums, int q) {
        int[] res = new int[nums.length + 1];
        for (int i = 1; i < nums.length + 1; i++) {
            res[i] = res[i - 1] + nums[nums.length - i];
        }
        return res[q];
    }
}
