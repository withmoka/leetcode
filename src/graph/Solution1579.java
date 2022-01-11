package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution1579 {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        DSUConnected dsuA = new DSUConnected(n + 1);
        DSUConnected dsuB = new DSUConnected(n + 1);
        int res = 0;
        for (int[] edge : edges) {
            int type = edge[0];
            int v1 = edge[1];
            int v2 = edge[2];
            if (type == 3) {
                if (dsuA.isConnected(v1, v2)) {
                    res++;
                } else {
                    dsuA.union(v1, v2);
                    dsuB.union(v1, v2);
                }
            }
        }
        //问题就在这里，第一次遍历，必须将所有的type为3的边通通连接起来，然后再去讨论第二次遍历
        for(int[] edge :edges){
            int type = edge[0];
            int v1 = edge[1];
            int v2 = edge[2];
            if (type == 1) {
                if (dsuA.isConnected(v1, v2)) {
                    res++;
                } else {
                    dsuA.union(v1, v2);
                }
            } else if(type==2){
                if (dsuB.isConnected(v1, v2)) {
                    res++;
                } else {
                    dsuB.union(v1, v2);
                }
            }
        }
        //getSize的方法，可以得到有几个集合，因为有一个0没有做合并，所以按道理处理完以后应当各是两个集合
        if (dsuA.getSize() != 2 || dsuB.getSize() != 2) {
            return -1;
        }
        return res;
    }
}
