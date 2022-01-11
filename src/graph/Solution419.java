package graph;

public class Solution419 {
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        DSU dsu = new DSU(m * n);
        int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char ch = board[i][j];
                if (ch == 'X') {
                    for (int[] dir : dirs) {
                        int x = dir[0] + i;
                        int y = dir[1] + j;
                        if (x < 0 || x >= m || y < 0 || y >= n || board[x][y] == '.') {
                            continue;
                        }
                        dsu.union(i * n + j, x * n + y);
                    }
                } else {
                    count++;
                }
            }
        }
        int u = dsu.numOfUnion();
        return u - count;
    }
}
