package arr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution1636 {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums) {
//            if (!map.containsKey(num)) {
//                map.put(num, 1);
//            } else {
//                map.put(num, map.get(num) + 1);
//            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Map.Entry<Integer, Integer>> arrayList = new ArrayList<>(map.entrySet());
        Collections.sort(arrayList, (o1, o2) -> o1.getValue().equals(o2.getValue()) ? (o2.getKey() - o1.getKey()) : (o1.getValue().compareTo(o2.getValue())));
        int[] res = new int[nums.length];
        int z = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.get(i).getValue(); j++) {
                res[z++] = arrayList.get(i).getKey();
            }
        }
        return res;
    }
}
