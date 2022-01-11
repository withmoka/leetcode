package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution947 {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        DSU dsu = new DSU(n);
        Map<Integer, Integer> rowToIndex = new HashMap<>();
        Map<Integer, Integer> colToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!rowToIndex.containsKey(stones[i][0])) {
                rowToIndex.put(stones[i][0], i);
            } else {
                dsu.union(rowToIndex.get(stones[i][0]), i);
            }
            if (!colToIndex.containsKey(stones[i][1])) {
                colToIndex.put(stones[i][1], i);
            } else {
                dsu.union(colToIndex.get(stones[i][1]), i);
            }
        }
        return n - dsu.numOfUnion();
    }
}
