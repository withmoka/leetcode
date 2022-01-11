package arr;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution5196 {
    public int[] canSeePersonsCount(int[] heights) {
        int len = heights.length;
        int[] res = new int[len];
        //最后一个跳过
        for (int i = 0; i < len - 1; i++) {
            Deque<Integer> stack = new ArrayDeque<>();
            for (int j = i + 1; j < len; j++) {
                if (j == i + 1) {
                    stack.push(heights[j]);
                } else if (heights[j] > stack.peek() && heights[i] > stack.peek()) {
                    stack.push(heights[j]);
                }
            }
            res[i] = stack.size();
        }
        return res;
    }
}
