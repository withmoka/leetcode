package graph;

public class Solution323 {
    public int countComponents(int n, int[][] edges) {
        DSU dsu = new DSU(n);
        for (int[] ele : edges) {
            dsu.union(ele[0], ele[1]);
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
