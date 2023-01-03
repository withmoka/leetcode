package arr;

import java.util.ArrayList;
import java.util.List;

public class Solution386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            dfs(n, i, res);
        }
        return res;
    }

    public void dfs(int n, int i, List<Integer> res) {
        if (i > n) {
            return;
        }
        res.add(i);
        i *= 10;
        for (int index = 0; index < 10; index++) {
            dfs(n, i + index, res);
        }
    }
}
