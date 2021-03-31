package graph;

public class Solution200 {

    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        DSU dsu = new DSU(m * n);
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    for (int[] dir : dirs) {
                        int x = dir[0] + i;
                        int y = dir[1] + j;
                        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == '0') {
                            continue;
                        }
                        int component1 = dsu.find(i * n + j);
                        int component2 = dsu.find(x * n + y);
                        if (component1 != component2) {
                            dsu.union(component2, component1);
                            count--;
                        }
                    }
                }
            }
        }
        return count;
    }
}
