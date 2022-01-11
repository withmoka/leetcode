package arr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> cur = map.getOrDefault(groupSizes[i], new ArrayList<>());
            cur.add(i);
            map.put(groupSizes[i], cur);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int num : map.keySet()) {
            List<Integer> temp = map.get(num);
            int count = temp.size() / num;
            for (int i = 0; i < count; i++) {
                List<Integer> ele = new ArrayList<>();
                for (int j = 0; j < num; j++) {
                    ele.add(temp.get(i * num + j));
                }
                res.add(ele);
            }
        }
        return res;
    }
}
