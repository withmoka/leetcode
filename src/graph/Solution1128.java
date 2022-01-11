package graph;

import java.util.HashMap;
import java.util.Map;

public class Solution1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < dominoes.length; i++) {
            int a = dominoes[i][0];
            int b = dominoes[i][1];
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            int number = max * 10 + min;
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        for (int key : map.keySet()) {
            int count = map.get(key);
            res += count * (count - 1) / 2;
        }
        return res;
    }
}
