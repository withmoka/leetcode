package arr;

public class Solution1704 {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = len * (len + 1) / 2;
        int count = 0;
        for (int num : nums) {
            count += num;
        }
        return sum - count;
    }
}
