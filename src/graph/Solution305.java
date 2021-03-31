package graph;

import java.util.ArrayList;
import java.util.List;

public class Solution305 {

    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        DSU dsu = new DSU(m * n);
        boolean[][] island = new boolean[m][n];
        List<Integer> res = new ArrayList();
        int count = 0;
        for (int[] cur : positions) {
            if (island[cur[0]][cur[1]]) {
                res.add(count);
                continue;
            }
            island[cur[0]][cur[1]] = true;
            count++;
            for (int[] dir : dirs) {
                int x = cur[0] + dir[0];
                int y = cur[1] + dir[1];
                if (x < 0 || x >= m || y < 0 || y >= n || island[x][y] == false) {
                    continue;
                }
                int component1 = dsu.find(cur[0] * n + cur[1]);
                int component2 = dsu.find(x * n + y);
                if (component1 != component2) {
                    dsu.union(component2, component1);
                    count--;
                }
            }
            res.add(count);
        }
        return res;
    }
}


