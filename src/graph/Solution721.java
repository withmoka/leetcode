package graph;

import java.util.*;

public class Solution721 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        //构造两张哈希表，emailToIndex,emailToName
        Map<String, Integer> emailToIndex = new HashMap<>();
        Map<String, String> emailToName = new HashMap<>();
        int emailCount = 0;
        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String address = account.get(i);
                if (!emailToIndex.containsKey(address)) {
                    emailToIndex.put(address, emailCount);
                    emailCount++;
                    emailToName.put(address, name);
                }
            }
        }
        //处理一个DSU
        DSU dsu = new DSU(emailCount);
        for (List<String> account : accounts) {
            String FirstAddress = account.get(1);
            int firstIndex = emailToIndex.get(FirstAddress);
            for (int i = 2; i < account.size(); i++) {
                String nextAddress = account.get(i);
                int nextIndex = emailToIndex.get(nextAddress);
                dsu.union(nextIndex, firstIndex);
            }
        }
        //parent记作账户
        Map<Integer, List<String>> indexToEmail = new HashMap<>();
        for (String email : emailToIndex.keySet()) {
            //index表示账户
            int index = dsu.find(emailToIndex.get(email));
            //问题在下面这句，account是一个要去找的东西，如果hash表里有，去取过来；如果没有，新new一个空白的
            List<String> account = indexToEmail.getOrDefault(index, new ArrayList<String>());
            //把当前地址放进这个数组里面。相当于不断更新。一开始肯定没有，就去new，然后把一个地址放进去，就结束了
            //后来，肯定能找到，那就不用new，直接取出来，加地址，结束
            account.add(email);
            //下面这个可以理解，对于每个账户，都去找出一个数组，这个数组包含了一个集合的邮箱地址,account?
            indexToEmail.put(index, account);
        }
        //整理最后的结果
        List<List<String>> merged = new ArrayList<>();
        for (List<String> email : indexToEmail.values()) {
            Collections.sort(email);
            String name = emailToName.get(email.get(0));
            List<String> account = new ArrayList<>();
            account.add(name);
            account.addAll(email);
            merged.add(account);
        }
        return merged;
    }
}
