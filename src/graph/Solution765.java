package graph;

public class Solution765 {
    public int minSwapsCouples(int[] row) {
        int len = row.length;
        int n = len / 2;
        DSU dsu = new DSU(n);
        //n对情侣，问其中有几个环，也就是说有几个集合
        //遍历row，一条长椅上的，锁到一个环里面
        for (int i = 0; i < len; i = i + 2) {
            dsu.union(row[i] / 2, row[i + 1] / 2);
            //row[i]是指偶数座位（0，2，4，6……）上的数字，row[i+1]是指奇数座位（1，3，5，7……）上的数字
            //数字除以2，就是所在的情侣对数，我们把情侣对合到一起
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
