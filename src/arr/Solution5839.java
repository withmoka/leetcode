package arr;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution5839 {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int pile : piles) {
            queue.add(pile);
        }
        while (k > 0) {
            int max = queue.poll();
            max -= max / 2;
            queue.add(max);
            k--;
        }
        int sum = 0;
        for (int ele : queue) {
            sum += ele;
        }
        return sum;
    }
}
