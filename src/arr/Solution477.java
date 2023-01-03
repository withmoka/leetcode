package arr;

public class Solution477 {
    public int totalHammingDistance(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                res += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return res;
    }
}
