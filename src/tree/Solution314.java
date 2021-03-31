package tree;

import java.util.*;

public class Solution314 {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> colToNode = new HashMap<>();//我们想知道每一个node，它在哪一个column里面
        Map<TreeNode, Integer> position = new HashMap<>();//当前所在的node和它的index？？？

        Queue<TreeNode> q = new LinkedList<>();

        if (root != null) {
            q.offer(root);
        }//当前node先进来
        position.put(root, 0);//初始化，位置是0，往左column-1，-2，……；往右column1，2，……
        int min = 0;
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            int col = position.get(cur);//拿出当前的column
            colToNode.computeIfAbsent(col, x -> new ArrayList<>()).add(cur.val);
            //上面这句话其实是两步，如果这个col为空的话，我们就加一个ArrayList
            //第二步是get这个col，然后在这个column里面，把cur.val放了进去
            if (cur.left != null) {
                q.add(cur.left);
                position.put(cur.left, col - 1);
            }
            if (cur.right != null) {
                q.add(cur.right);
                position.put(cur.right, col + 1);
            }
            min = Math.min(min, col);//然后我们看一下最左边的是多少？？？
        }
        while (colToNode.containsKey(min)) {
            res.add(colToNode.get(min++));
        }
        return res;
    }
}
