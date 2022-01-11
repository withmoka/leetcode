package arr;

import java.util.*;

public class Solution1331 {
    public int[] arrayRankTransform(int[] arr) {
        int len = arr.length;
        int[] cp = Arrays.copyOf(arr, len);
        int[] res = new int[len];
        Map<Integer, Integer> map = new HashMap<>();
        int index = 1;
        Arrays.sort(arr);
        for (int num : arr) {
            if (map.containsKey(num)) {
                continue;
            }
            map.put(num, index++);
        }
        for (int i = 0; i < len; i++) {
            res[i] = map.get(cp[i]);
        }
        return res;
    }
}
