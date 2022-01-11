package graph;

import java.util.*;

class Solution721Again {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Integer> emailToIndex = new HashMap<>();
        Map<String, String> emailToName = new HashMap<>();
        int count = 0;
        for (List<String> account : accounts) {
            String name = account.get(0);
            int length = account.size();
            for (int i = 1; i < length; i++) {
                String email = account.get(i);
                if (!emailToIndex.containsKey(email)) {
                    emailToIndex.put(email, count);
                    count++;
                    emailToName.put(email, name);
                }
            }
        }
        DSU dsu = new DSU(count);
        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            int firstIndex = emailToIndex.get(firstEmail);
            int length = account.size();
            for (int i = 2; i < length; i++) {
                String nextEmail = account.get(i);
                dsu.union(emailToIndex.get(nextEmail), firstIndex);
            }
        }
        Map<Integer, List<String>> map = new HashMap<>();
        for (String email : emailToIndex.keySet()) {
            int number = dsu.find(emailToIndex.get(email));
            List<String> list = map.getOrDefault(number, new ArrayList<>());
            list.add(email);
            map.put(number, list);
        }
        List<List<String>> merged = new ArrayList<>();
        for (List<String> email : map.values()) {
            Collections.sort(email);
            String firstEmail = email.get(0);
            List<String> res = new ArrayList<>();
            res.add(emailToName.get(firstEmail));
            res.addAll(email);
            merged.add(res);
        }
        return merged;
    }
}
