package arr;

import java.util.*;

public class Solution1338 {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int count = 0;
        int index = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            count += list.get(i);
            index++;
            if (count >= arr.length / 2) {
                return index;
            }
        }
        return -1;
    }
}
