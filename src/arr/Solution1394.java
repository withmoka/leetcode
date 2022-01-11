package arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1394 {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int res = -1;
        for (int number : map.keySet()) {
            if (map.get(number) == number) {
                res = Math.max(res, number);
            }
        }
        return res;
    }
}
