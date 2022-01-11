package arr;

import java.util.Arrays;

public class Solution1051 {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] sortArr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortArr);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortArr[i]) {
                count++;
            }
        }
        return count;
    }
}
