package tree;

import java.util.*;

public class Solution314MyDemoAgain {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Map<TreeNode, Integer> position = new HashMap<>();
        Map<Integer, List<Integer>> colToNode = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) {
            q.offer(root);
        }
        position.put(root, 0);
        int min = 0;
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            int col = position.get(cur);
            colToNode.computeIfAbsent(col, key -> new ArrayList<>()).add(cur.val);
            if (cur.left != null) {
                q.offer(cur.left);
                position.put(cur.left, col - 1);
            }
            if (cur.right != null) {
                q.offer(cur.right);
                position.put(cur.right, col + 1);
            }
            min = Math.min(min, col);
        }
        while (colToNode.containsKey(min)) {
            res.add(colToNode.get(min));
            min++;
        }
        return res;
    }
}
