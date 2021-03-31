package graph;

public class Solution547Demo {
    public int findCircleNum(int[][] isConnected) {
        DSU dsu = new DSU(isConnected.length);//二维数组的length就是第一维数组的length
        for (int i = 0; i < isConnected.length; i++) {//其实就是去数每一行
            for (int j = 0; j < isConnected[i].length; j++) {//每一列
                if (isConnected[i][j] == 1) {//如果矩阵中标了1，也就是说i和j之间是相联的
                    dsu.union(i, j);//就并起来
                }
            }
        }
        int res = 0;
        for (int i = 0; i < isConnected.length; i++) {
            //怎么去数一共有几个堆？？？
            if (dsu.find(i) == i) {
                res++;//根是自己，说明它可以代表一个堆
            }
        }
        return res;
    }
}
