package arr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        if (map1.size() < map2.size()) {
            for (int key : map1.keySet()) {
                if (map2.containsKey(key)) {
                    int length = Math.min(map1.get(key), map2.get(key));
                    for (int i = 0; i < length; i++) {
                        list.add(key);
                    }
                }
            }
        } else {
            for (int key : map2.keySet()) {
                if (map1.containsKey(key)) {
                    int length = Math.min(map1.get(key), map2.get(key));
                    for (int i = 0; i < length; i++) {
                        list.add(key);
                    }
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
