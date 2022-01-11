package graph;

class Solution1579Again {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        DSU dsuA = new DSU(n + 1);
        DSU dsuB = new DSU(n + 1);
        int count = 0;
        //为了保证type为3的边的优先性，第一次遍历只处理type为3的边
        for (int[] edge : edges) {
            int type = edge[0];
            int v1 = edge[1];
            int v2 = edge[2];
            if (type == 3) {
                //对于一条type为3的边，只需要检查v1，v2在其中一个集合中的连通性即可。只要在一个集合中连通/不连通，那么在另一个集合中一定也是连通/不连通的
                if (!dsuA.isConnected(v1, v2)) {
                    dsuA.union(v1, v2);
                    dsuB.union(v1, v2);
                } else {
                    count++;
                }
            }
        }
        for (int[] edge : edges) {
            int type = edge[0];
            int v1 = edge[1];
            int v2 = edge[2];
            //对于type为1和type为2的边，所对应的顶点在两个集合中的连通性是不相关的，可以放在一次遍历中去判断
            if (type == 1) {
                if (!dsuA.isConnected(v1, v2)) {
                    dsuA.union(v1, v2);
                } else {
                    count++;
                }
            }
            if (type == 2) {
                if (!dsuB.isConnected(v1, v2)) {
                    dsuB.union(v1, v2);
                } else {
                    count++;
                }
            }
        }
        //最后要判断，添加完所有边以后，两个dsu中是否各自含有两个集合，集合数为2表示连通，返回count；否则表示不连通，返回-1
        //0没有作处理，单成为1个集合
        if (dsuA.numOfUnion() == 2 && dsuB.numOfUnion() == 2) {
            return count;
        }
        return -1;
    }
}
