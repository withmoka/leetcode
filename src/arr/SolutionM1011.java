package arr;

import java.util.Arrays;

public class SolutionM1011 {
    public void wiggleSort(int[] nums) {
        int[] cp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(cp);
        int l = 0;
        int r = nums.length - 1;
        int index = 0;
        while (l <= r) {
            if (index % 2 == 0) {
                nums[index] = cp[r];
                r--;
            } else {
                nums[index] = cp[l];
                l++;
            }
            index++;
        }
    }
}
