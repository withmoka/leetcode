package graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution1202 {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        DSU dsu = new DSU(n);
        for (int i = 0; i < pairs.size(); i++) {
            dsu.union(pairs.get(i).get(0), pairs.get(i).get(1));
        }
        Map<Integer, PriorityQueue<Character>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(dsu.find(i), key -> new PriorityQueue<>()).offer(s.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int root = dsu.find(i);
            stringBuilder.append(map.get(root).poll());
        }
        return stringBuilder.toString();
    }
}
