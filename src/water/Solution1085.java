package water;

import java.util.Arrays;

public class Solution1085 {
    public int sumOfDigits(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int sum = helper(min);
        if (sum % 2 == 1) {
            return 0;
        }
        return 1;
    }

    public int helper(int a) {
        int sum = 0;
        while (a != 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        return sum;
    }
}
