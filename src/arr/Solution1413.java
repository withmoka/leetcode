package arr;

public class Solution1413 {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            min = Math.min(min, sum);
        }
        if (min < 0) {
            return 1 - min;
        }
        return 1;
    }
}
