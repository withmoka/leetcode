package graph;

public class Solution684 {
    public int[] findRedundantConnection(int[][] edges) {
        int N = edges.length;
        DSUbool dsu = new DSUbool(N + 1);
        int[] res = new int[2];
        for (int[] element : edges) {
            if (dsu.union(element[0], element[1])) {
                continue;
            }
            res[0] = element[0];
            res[1] = element[1];
        }
        return res;
    }
}
