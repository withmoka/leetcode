package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution451 {

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        PriorityQueue<Character> queue = new PriorityQueue<>((x, y) -> map.get(y) - map.get(x));
        queue.addAll(map.keySet());
        StringBuilder res = new StringBuilder();
        while (!queue.isEmpty()) {
            char cur = queue.poll();
            int value = map.get(cur);
            for (int i = 0; i < value; i++) {
                res.append(cur);
            }
        }
        return res.toString();
    }
}
