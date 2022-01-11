package sort;

import java.util.*;

public class Solution1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int ele : arr2) {
            map.put(ele, 0);
        }
        List<Integer> list = new ArrayList<>();
        for (int ele : arr1) {
            if (map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
            } else {
                list.add(ele);
            }
        }
        Collections.sort(list);
        int index = 0;
        for (int ele : arr2) {
            int num = map.get(ele);
            for (int i = 0; i < num; i++) {
                res[index++] = ele;
            }
        }
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                res[index + i] = list.get(i);
            }
        }
        return res;
    }
}
