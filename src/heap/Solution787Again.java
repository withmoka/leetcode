package heap;

import java.util.LinkedList;
import java.util.Queue;

class Solution787Again {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[][] graph = new int[n][n];
        for (int[] f : flights) {
            graph[f[0]][f[1]] = f[2];
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, src, K + 1});
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int price = cur[0];
            int place = cur[1];
            int remainSteps = cur[2];
            if (place == dst) {
                return price;
            }
            //remainSteps用于判断是否能继续访问当前结点的相邻结点
            if (remainSteps > 0) {
                //如果能够访问就去访问那些可以到达的相邻结点
                for (int i = 0; i < n; i++) {
                    if (graph[place][i] != 0) {
                        queue.offer(new int[]{price + graph[place][i], i, remainSteps - 1});
                    }
                }
            }
        }
        return -1;
    }
}
