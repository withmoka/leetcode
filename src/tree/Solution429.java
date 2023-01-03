package tree;

import java.util.*;

public class Solution429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int qs = q.size();
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < qs; i++) {
                Node n = q.poll();
                tmp.add(n.val);
                for (Node child : n.children) {
                    q.offer(child);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
