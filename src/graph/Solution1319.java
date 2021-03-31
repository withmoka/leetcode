package graph;

public class Solution1319 {
    public int makeConnected(int n, int[][] connections) {
        DSUbool dsu = new DSUbool(n);
        int edgesNum = connections.length;
        if (edgesNum < (n - 1)) {
            return -1;
        }
        int count = 0;
        for (int[] ele : connections) {
            if (dsu.union(ele[0], ele[1])) {
                continue;
            }
            count++;
        }
        //生成树一共需要n-1条，实际构成中已经有了edgesNum-count条，还需要need条（相减）
        int need = n - 1 - (edgesNum - count);
        if (count >= need) {
            return need;
        }
        return -1;
    }
}
