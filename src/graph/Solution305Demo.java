package graph;

import java.util.ArrayList;
import java.util.List;

public class Solution305Demo {

    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        DSU dsu = new DSU(m * n);//先去new一个dsu对象，虽然不知道干嘛用，应该是用于把m*n这么多个元素进行划分集合
        boolean[][] island = new boolean[m][n];//应该是用于标记说这块岛屿有没有翻过，翻过一次就不要再翻了，初始化都是false
        List<Integer> res = new ArrayList<>();//需要返回计算出来的每次 addLand 操作后岛屿的数量
        int count = 0;//计数器
        for (int[] cur : positions) {//对于positions的每一个一维的，确实positions里面，比如抽了一个[1,2]
            if (island[cur[0]][cur[1]]) {//cur[0]表示1，cur[1]表示2；那么island[1][2]这个位置，如果已经翻过了
                res.add(count);//如果已经翻过了，那就不会再去翻了，count是不会变化的，直接记录下来额就好
                continue;//continue 语句是跳过循环体中剩余的语句而强制执行下一次循环，
                //其作用为结束本次循环，即跳过循环体中下面尚未执行的语句，接着进行下一次是否执行循环的判定。
                //这里结束，回到for
                //它与 break 语句的区别在于：continue 并不是中断循环语句，而是中止当前迭代的循环，进入下一次的迭代。
                //注意：continue 语句只能用在 while 语句、for 语句或者 foreach 语句的循环体之中，
                //在这之外的任何地方使用它都会引起语法错误。
            }
            island[cur[0]][cur[1]] = true;//如果跳过了if语句，那么这里率先将牌子翻为true
            //cur[0]相当于x坐标，cur[1]相当于y坐标
            count++;//不管怎么样我先默认这个岛是新加的

            //之后的操作是union find??如果能合并再减回去？？？？？
            for (int[] dir : dirs) {//把上面那个二维数组的每一个拎出来看
                int x = cur[0] + dir[0];//???????这一通操作相当于把这个坐标向上下左右各移动了一次
                int y = cur[1] + dir[1];
                if (x < 0 || x >= m || y < 0 || y >= n || island[x][y] == false) {
                    continue;//????????如果上下左右出边界了，边界也是水，没毛病；或者说本身就是水（还没翻成岛嘛！就跳过这个方向
                }
                //否则就说明这个坐标在这个方向上连着一个岛，然后要判断，自己和这个岛现在有没有归到一个集合里去了
                //如果还没有归到一个集合，就去合并
                int component1 = dsu.find(cur[0] * n + cur[1]);//????component1指rootX
                //这里cur[0]是真正的x坐标*n（第几行，每行有n个），再加上y坐标，就是当下的这个点的id，就是dsu里面的那个id
                int component2 = dsu.find(x * n + y);//component2指rootY
                //这里移动以后的x y坐标也是一样的计算方法，通过这个id去找它们的parent
                if (component1 != component2) {
                    dsu.union(component2, component1);//属于不同的两个set的话就合并
                    count--;
                }
            }
            //每次翻完牌子计算好有几个岛都要去加到res里面
            res.add(count);
        }
        return res;
    }
}

