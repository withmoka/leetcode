package graph;

class Solution130Again {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        DSU dsu = new DSU(m * n + 1);
        int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    for (int[] dir : dirs) {
                        int x = dir[0] + i;
                        int y = dir[1] + j;
                        if (x < 0 || x >= m || y < 0 || y >= n || board[x][y] == 'X') {
                            continue;
                        }
                        dsu.union(i * n + j, x * n + y);
                    }
                    if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                        dsu.union(i * n + j, m * n);
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && dsu.find(i * n + j) != dsu.find(m * n)) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
