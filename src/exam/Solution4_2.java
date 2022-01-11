package exam;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

//m+n-1
public class Solution4_2 {
    public static int helper(int[] arr) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int ele : arr) {
            queue.add(ele);
        }
        int count = 0;
        while (queue.size() > 1) {
            System.out.println(queue);
            int m = queue.poll();
            int n = queue.poll();
            count += m + n - 1;
            queue.add(m + n);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 11, 2};
        int res = helper(arr);
        System.out.println(res);
    }
}
