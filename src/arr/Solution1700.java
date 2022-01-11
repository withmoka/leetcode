package arr;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        int len = students.length;
        Queue<Integer> stu = new LinkedList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < len; i++) {
            stu.offer(students[i]);
            stack.push(sandwiches[len - 1 - i]);
        }
        while (!stu.isEmpty() && stu.contains(stack.peek())) {
            int target = stack.peek();
            if (stu.peek() == target) {
                stu.poll();
                stack.pop();
            } else {
                stu.offer(stu.poll());
            }
        }
        return stu.size();
    }
}
