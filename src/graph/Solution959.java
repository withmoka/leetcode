package graph;

public class Solution959 {
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        DSU dsu = new DSU(4 * n * n);
        for (int i = 0; i < n; i++) {
            char[] row = grid[i].toCharArray();
            for (int j = 0; j < n; j++) {
                char ch = row[j];
                int index = 4 * (i * n + j);
                if (ch == '/') {
                    dsu.union(index + 3, index);
                    dsu.union(index + 1, index + 2);
                } else if (ch == '\\') {
                    dsu.union(index + 1, index);
                    dsu.union(index + 2, index + 3);
                } else {
                    dsu.union(index, index + 1);
                    dsu.union(index, index + 2);
                    dsu.union(index, index + 3);
                }
                if (j + 1 < n) {
                    dsu.union(index + 1, 4 * (i * n + j + 1) + 3);
                }
                if (i + 1 < n) {
                    dsu.union(index + 2, 4 * ((i + 1) * n + j));
                }
            }
        }
        return dsu.numOfUnion();
    }
}
