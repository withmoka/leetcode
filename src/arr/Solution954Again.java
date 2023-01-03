package arr;

import java.util.Map;
import java.util.TreeMap;

public class Solution954Again {
    public boolean canReorderDoubled(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int ele : arr) {
            if (map.containsKey(ele)) {
                int value = map.get(ele);
                map.put(ele, value + 1);
            } else {
                map.put(ele, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value < 0) {
                return false;
            }
            if (value == 0) {
                continue;
            }
            if (key > 0) {
                if (!map.containsKey(key * 2)) {
                    return false;
                }
                map.put(key * 2, map.get(key * 2) - value);
            } else {
                if (key % 2 != 0) {
                    return false;
                }
                if (!map.containsKey(key / 2)) {
                    return false;
                }
                map.put(key / 2, map.get(key / 2) - value);
            }
        }
        return true;
    }
}
