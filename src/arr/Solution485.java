package arr;

public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int index = 0;
        int count = 0;
        int max = 0;
        while (index != nums.length) {
            if (nums[index] == 1) {
                count++;
                index++;
            } else {
                max = Math.max(max, count);
                count = 0;
                index++;
            }
        }
        return Math.max(max, count);
    }
}
