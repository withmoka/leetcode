/**
 * 1135.最低成本联通所有城市
 * eg
 * 输入：N = 3, conections = [[1,2,5],[1,3,6],[2,3,1]]
 * 输出：6
 * 解释：
 * 选出任意 2 条边都可以连接所有城市，我们从中选取成本最小的 2 条。
 *
 * 输入：N = 4, conections = [[1,2,3],[3,4,4]]
 * 输出：-1
 * 解释：
 * 即使连通所有的边，也无法连接所有城市。
 */

package graph;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution1135Demo {

    public static void main(String[] args) {

    }
}

class Solution1135 {

    public int minimumCost(int N, int[][] connections) {
        // sort connections by cost from small to large
        // lambda表达式吧 比较两个数组第2个元素的比较结果作为两数组大小的比较
        Arrays.sort(connections, Comparator.comparingInt(a -> a[2]));
        //按照a[2]对这个三维数组进行排序？？？？反正就是按照这个排序吧！

        int[] parent = new int[N+1];
        for (int i = 1; i <= N; ++i) {
            parent[i] = i;
        }

        int cost = 0;

        for (int[] edge : connections) {
            if (union(edge[0], edge[1], parent)) {
                cost += edge[2];
            }
        }

        // System.out.println(Arrays.toString(parent));

        int p = -1;
        for (int i = 1; i <= N; ++i) {
            int root = findRoot(i, parent);
            if (p == -1) {
                p = root;
            } else if (p != root) {
                return -1;
            }
        }
        return cost;
    }

    public int findRoot(int x, int[] parent) {
        while (x != parent[x]) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }

    public boolean union(int a, int b, int[] parent) {
        a = findRoot(a, parent);
        b = findRoot(b, parent);
        if (a == b) return false;
        parent[a] = b;
        return true;
    }
}
