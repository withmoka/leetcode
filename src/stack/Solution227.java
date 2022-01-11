package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution227 {
    public int calculate(String s) {
        Deque<Integer> num = new ArrayDeque<>();
        Deque<Character> op = new ArrayDeque<>();
        String[] split = s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        for (String s1 : split) {
            if (s1.charAt(0) == ' ') {
                s1 = s1.strip();
                if (s1.length() == 0) {
                    continue;
                }
            }
            if (s1.charAt(0) >= 48 && s1.charAt(0) <= 57) {
                int number = Integer.parseInt(s1);
                num.push(number);
                if (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                    int b = num.pop();
                    int a = num.pop();
                    char cur = op.pop();
                    int res = 0;
                    if (cur == '*') {
                        res = a * b;
                    } else {
                        res = a / b;
                    }
                    num.push(res);
                }
            } else {
                char ch = s1.charAt(0);
                op.push(ch);
            }
        }
        int sum = 0;
        while (!op.isEmpty()) {
            char cur = op.pop();
            if (cur == '+') {
                sum += num.pop();
            } else {
                sum -= num.pop();
            }
        }
        sum += num.pop();
        return sum;
    }
}
