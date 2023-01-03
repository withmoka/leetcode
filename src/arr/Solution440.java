package arr;

import java.util.ArrayList;
import java.util.List;

public class Solution440 {
    public static int findKthNumber(int n, int k) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            dfs(n, i, res);
        }
        return res.get(k - 1);
    }

    public static void dfs(int n, int i, List<Integer> res) {
        if (i > n) {
            return;
        }
        res.add(i);
        i *= 10;
        for (int index = 0; index < 10; index++) {
            dfs(n, i + index, res);
        }
    }

    public static void main(String[] args) {
        int n = 100;
        int k = 10;
        int res = findKthNumber(n, k);
//        res = 10
        System.out.println(res);
    }
}
