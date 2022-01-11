package graph;

public class Solution547Again {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        DSU dsu = new DSU(n);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    dsu.union(i, j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (dsu.find(i) == i) {
                count++;
            }
        }
        return count;
    }
}
