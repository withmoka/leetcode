package prefix;

import java.util.*;

public class Solution1788 {
    public int maximumBeauty(int[] flowers) {
        int res = Integer.MIN_VALUE;
        int len = flowers.length;
        int[] pre = new int[len + 1];
        for (int i = 1; i < len + 1; i++) {
            pre[i] = pre[i - 1] + Math.max(flowers[i - 1], 0);
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < flowers.length; i++) {
            int number = flowers[i];
            List<Integer> list = map.getOrDefault(number, new ArrayList<>());
            list.add(i);
            map.put(number, list);
        }
        for (int value : map.keySet()) {
            List<Integer> list = map.get(value);
            if (list.size() > 1) {
                int left = list.get(0);
                int right = list.get(list.size() - 1);
                res = Math.max(pre[right] + flowers[right] - pre[left + 1] + flowers[left], res);
            }
        }
        return res;
    }
}
