package training;

public class Solution547 {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        DSU dsu = new DSU(n);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    dsu.union(i, j);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (dsu.find(i) == i) {
                res++;
            }
        }
        return res;
    }
}
