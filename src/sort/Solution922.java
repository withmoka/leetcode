package sort;

public class Solution922 {
    public int[] sortArrayByParityII(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int i = 0;
        int j = 1;
        for (int k = 0; k < len; k++) {
            if (nums[k] % 2 == 0) {
                res[i] = nums[k];
                i = i + 2;
            } else {
                res[j] = nums[k];
                j = j + 2;
            }
        }
        return res;
    }
}
