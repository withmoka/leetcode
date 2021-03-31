package graph;

public class Solution261 {
    public boolean validTree(int n, int[][] edges) {
        int edgesNum = edges.length;
        DSUbool dsu = new DSUbool(n);
        int count = 0;
        for (int[] ele : edges) {
            if (dsu.union(ele[0], ele[1])) {
                continue;
            }
            count++;
        }//冗余边一共有count条
        if (edgesNum == n - 1 && count == 0) {
            return true;
        }
        return false;
    }
}
