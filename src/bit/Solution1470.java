package bit;

class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                nums[2 * i] |= ((nums[i] & 1023) << 10);
            } else {
                nums[2 * (i - n) + 1] |= ((nums[i] & 1023) << 10);
            }
        }
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = nums[i] >> 10;
        }
        return nums;
    }
}
