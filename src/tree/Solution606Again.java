package tree;

public class Solution606Again {
    public String tree2str(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        helper(root, sb);
        return sb.toString();
    }

    public void helper(TreeNode root, StringBuffer sb) {
        if (root != null) {
            sb.append(root.val);
            if (root.left != null || root.right != null) {
                sb.append('(');
                helper(root.left, sb);
                sb.append(')');
                if (root.right != null) {
                    sb.append('(');
                    helper(root.right, sb);
                    sb.append(')');
                }
            }
        }
    }

}
