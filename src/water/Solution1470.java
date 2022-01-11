package water;

class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n * 2; i++) {
            if (i < n) {
                ans[2 * i] = nums[i];
            } else {
                ans[2 * (i - n) + 1] = nums[i];
            }
        }
        return ans;
    }
}
