package arr;

import java.util.*;

public class Solution5809 {
    public int countPalindromicSubsequence(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int res = 0;
        Set<Character> start = new HashSet<>();
        //记录不同字母各自出现的最后位置
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < len - 2; i++) {
            //如果某一个起始字符已经讨论过了，那么再往后遇到同样的字符就不做讨论，不能再作为起点
            if (start.contains(arr[i])) {
                continue;
            }
            //对于每一个起始字符，将起点与终点之间（不包括起终点）的字符扔入集合，计算有多少个
            int end = map.get(arr[i]);
            Set<Character> temp = new HashSet<>();
            for (int j = i + 1; j < end; j++) {
                temp.add(arr[j]);
            }
            res += temp.size();
            start.add(arr[i]);
        }
        return res;
    }
}
