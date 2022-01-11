package arr;

public class Solution1848 {
    public int getMinDistance(int[] nums, int target, int start) {
        int dis = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && Math.abs(i - start) < dis) {
                dis = Math.abs(i - start);
            }
        }
        return dis;
    }
}
