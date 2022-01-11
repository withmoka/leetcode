package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1614 {
    public int maxDepth(String s) {
        int max = 0;
        Deque<Character> stack = new ArrayDeque<>();
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            if (ch == '(') {
                stack.push('(');
                max = Math.max(max, stack.size());
            } else if (ch == ')') {
                stack.pop();
            }
        }
        return max;
    }
}
