package tree;

public class Solution606 {
    // 题目的意思是子节点需要用()来包裹。举例来说，二叉树[root,left,right]，则转换为root(left)(right)。
    // 如果只有left为空节点，则输出root()(right)；如果只有right为空节点则可以忽略右节点的()，输出为root(left)。
    public String tree2str(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        helper(root, sb);
        return sb.toString();
    }

    public void helper(TreeNode root, StringBuffer sb) {
        if (root.left == null && root.right != null) {
            sb.append(root.val);
            sb.append("()");
            helper(root.right, sb);
        }
        if (root.left != null && root.right == null) {
            sb.append('(');
            sb.append(root.val);
            helper(root.left, sb);
            sb.append(')');
        }
        if (root.left != null && root.right != null) {
            sb.append('(');
            sb.append(root.val);
            helper(root.left, sb);
            helper(root.right, sb);
            sb.append(')');
        }
        if (root.left == null && root.right == null) {
            sb.append('(');
            sb.append(root.val);
            sb.append(')');
        }
    }
}
