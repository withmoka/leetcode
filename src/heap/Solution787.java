package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution787 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[][] graph = new int[n][n];
        for (int[] f : flights) {
            graph[f[0]][f[1]] = f[2];
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        heap.offer(new int[]{0, src, K + 1});
        while (!heap.isEmpty()) {
            int[] cur = heap.poll();
            int price = cur[0];
            int place = cur[1];
            int remainSteps = cur[2];
            if (place == dst) {
                return price;
            }
            if (remainSteps > 0) {
                for (int i = 0; i < n; i++) {
                    if (graph[place][i] != 0) {
                        heap.offer(new int[]{price + graph[place][i], i, remainSteps - 1});
                    }
                }
            }
        }
        return -1;
    }
}
