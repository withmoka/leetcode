package graph;

class Solution130 {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        DSU dsu = new DSU(m * n + 1);
        int k = m * n;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                        dsu.union(i * n + j, k);
                        //边界上的O，靠到k的集合上去，左靠右
                    } else {
                        //其他的O，去检查上下左右，如果上下左右越界或者是X，跳过；否则，也就是O
                        //上下左右是O时，把当前的O和邻近的O靠一起
                        for (int[] dir : dirs) {
                            int x = dir[0] + i;
                            int y = dir[1] + j;
                            if (x < 0 || x >= m || y < 0 || y >= n || board[x][y] == 'X') {
                                continue;
                            }
                            dsu.union(i * n + j, x * n + y);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    if (dsu.find(i * n + j) == dsu.find(k)) {
                        continue;
                    }
                    board[i][j] = 'X';
                }
            }
        }
    }
}
