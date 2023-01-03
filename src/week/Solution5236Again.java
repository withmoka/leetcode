package week;

public class Solution5236Again {
    public static int minDeletion(int[] nums) {
        int count = 0;
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int i = 0;
        while (i < len - 1) {
            if (nums[i] == nums[i + 1]) {
                count++;
                i++;
            } else {
                i += 2;
            }
        }
        if (i == len - 1) {
            return count + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 3, 5};
        int res = minDeletion(nums);
        System.out.println(res);
    }
}
