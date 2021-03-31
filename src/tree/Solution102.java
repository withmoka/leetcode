package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {
    /**
     * BFS 广度优先遍历
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) {
            q.offer(root);
        }
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                level.add(cur.val);
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
            res.add(level);
        }
        return res;
    }

    /**
     * DFS 深度优先遍历
     */
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root,res,0);
        return res;
    }

    public void dfs(TreeNode root, List<List<Integer>> res, int height) {
        if (root == null) {
            return;
        }
        if (height == res.size()) {
            res.add(new ArrayList<Integer>());
        }
        res.get(height).add(root.val);
        if (root.left != null) {
            dfs(root.left, res, height + 1);
        }
        if (root.right != null) {
            dfs(root.right, res, height + 1);
        }
    }
}
