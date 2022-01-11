package arr;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution5840 {
    public int minSwaps(String s) {
        char[] arr = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : arr) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                if (stack.peek() == '[' && ch == ']') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        int num = stack.size() / 2;
        if (num % 2 == 0) {
            return num / 2;
        } else {
            return (num + 1) / 2;
        }
    }
}
