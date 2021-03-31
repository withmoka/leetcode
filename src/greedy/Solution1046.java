package greedy;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);//大根堆
        for (int stone : stones) {
            queue.offer(stone);
        }
        while (queue.size() > 1) {
            int a = queue.poll();
            int b = queue.poll();
            if (a > b) {
                queue.offer(a - b);
            }
        }
        if (!queue.isEmpty()) {
            return queue.peek();
        }
        return 0;
    }
}
