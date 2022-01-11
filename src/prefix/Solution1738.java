package prefix;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution1738 {
    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] pre = new int[m + 1][n + 1];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        int count = 0;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                pre[i][j] = pre[i][j - 1] ^ pre[i - 1][j] ^ pre[i - 1][j - 1] ^ matrix[i - 1][j - 1];
                if (count < k) {
                    minHeap.offer(pre[i][j]);
                } else {
                    if (pre[i][j] > minHeap.peek()) {
                        minHeap.poll();
                        minHeap.offer(pre[i][j]);
                    }
                }
                count++;
            }
        }
        return minHeap.peek();
    }
}
