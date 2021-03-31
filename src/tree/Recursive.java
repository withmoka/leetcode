package tree;

import java.util.ArrayList;
import java.util.List;

public class Recursive {

    //遍历树的递归写法

    //给我一个根结点，我返回一个遍历的序列
    public List<Integer> traversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        //helper(root,res);这一部分是去调用一个遍历的模板，传入根结点和res，遍历结束以后要返回res
        return res;
    }

    public void preOrder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);//这一行其实是在进行root的考察，如果要求输出那就不需要res，直接输出即可
        preOrder(root.left, res);
        preOrder(root.right, res);
    }

    public void inOrder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inOrder(root.left, res);
        res.add(root.val);
        preOrder(root.right, res);
    }

    public void postOrder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        postOrder(root.left, res);
        postOrder(root.right, res);
        res.add(root.val);
    }
}
