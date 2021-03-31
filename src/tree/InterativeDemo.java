package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InterativeDemo {

    //遍历树的迭代写法

    public List<Integer> preOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();//需要一个栈来存放树的结点
        if (root != null) {
            stack.push(root);
        }//把根压进去
        while (!stack.isEmpty()) {//栈里的结点，出来以后就考察，然后再看这个结点有没有左右，有的话就再压
            root = stack.pop();
            res.add(root.val);
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return res;
    }

    public List<Integer> inOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {//这里有两个条件，一个是根不为空，第二个是栈里有结点
            while (root != null) {//一条道走到黑，直到左边没有结点了就往回退
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }

    public List<Integer> postOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            root = stack.pop();
            res.add(0, root.val);
            if (root.left != null) {
                stack.push(root.left);
            }
            if (root.right != null) {
                stack.push(root.right);
            }
        }
        return res;
    }
}
