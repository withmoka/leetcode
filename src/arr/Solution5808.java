package arr;

public class Solution5808 {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] res = new int[len * 2];
        for (int i = 0; i < len; i++) {
            res[i] = nums[i];
        }
        for (int i = len; i < len * 2; i++) {
            res[i] = nums[i - len];
        }
        return res;
    }
}
