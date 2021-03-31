package graph;

import java.util.ArrayList;
import java.util.List;

//我们首先对原图执行Kruskal 算法，得到最小生成树的权值value，随后我们枚举每一条边，
//首先判断其是否是关键边，如果不是关键边，再判断其是否是伪关键边。
//关键边：去除了以后，图不连通或者最小生成树权值严格大于value
//伪关键边：优先考虑，使最后生成树中不得不有它

class Solution1489 {
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        int numEdges = edges.length;
        List<List<Integer>> list = new ArrayList<>();

        return list;
    }
}