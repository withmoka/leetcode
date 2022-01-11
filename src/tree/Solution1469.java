package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution1469 {
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            int left = 0;
            int right = 0;
            if (cur.left != null) {
                queue.offer(cur.left);
                left = 1;
            }
            if (cur.right != null) {
                queue.offer(cur.right);
                right = 1;
            }
            if (left == 1 && right == 0) {
                res.add(cur.left.val);
            }
            if (left == 0 && right == 1) {
                res.add(cur.right.val);
            }
        }
        return res;
    }
}
