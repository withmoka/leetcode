package graph;

class Solution765Again {
    public int minSwapsCouples(int[] row) {
        int len = row.length;
        int n = len / 2;
        DSU dsu = new DSU(n);
        for (int i = 0; i < len; i = i + 2) {
            dsu.union(row[i] / 2, row[i + 1] / 2);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (dsu.find(i) == i) {
                count++;
            }
        }
        return n - count;
    }
}
