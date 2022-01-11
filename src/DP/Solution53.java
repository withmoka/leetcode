package DP;

class Solution53 {
    public int maxSubArray(int[] nums) {
        //sum只管往后加，如果sum小于零就舍弃，从新的数开始。
        //其实sum的值形成的数组中的最大值就是答案
        //这里增加一个max，用来记录sum数组中的最大值，这样就不必开数组了
        //max的初始值即为sum的初始值（注意sum的初始值为nums[i]）
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum > 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
