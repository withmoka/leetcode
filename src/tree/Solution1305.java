package tree;

import java.util.*;

public class Solution1305 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        helper(root1, a);
        helper(root2, b);
        for (int ele : a) {
            res.add(ele);
        }
        for (int ele : b) {
            res.add(ele);
        }
        Collections.sort(res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> list) {
        while (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left != null) {
            helper(root.left, list);
        }
        if (root.right != null) {
            helper(root.right, list);
        }
    }
}
