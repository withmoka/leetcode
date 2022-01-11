package stack;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution1006 {
    public int clumsy(int N) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(N);
        N--;
        int index = 0;
        int sum = 0;
        while (N > 0) {
            if (index % 4 == 0) {
                int res = stack.pop() * N;
                stack.push(res);
            } else if (index % 4 == 1) {
                int res = stack.pop() / N;
                stack.push(res);
            } else if (index % 4 == 2) {
                stack.push(N);
            } else {
                stack.push(-N);
            }
            index++;
            N--;
        }
        while (!stack.isEmpty()) {
            sum = sum + stack.pop();
        }
        return sum;
    }
}
