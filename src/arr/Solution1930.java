package arr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1930 {
    public int countPalindromicSubsequence(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        int[] m = new int[26];
        for (int i = 0; i < len; i++) {
            char ch = arr[i];
            map.put(ch, i);
        }
        for (int i = 0; i < len - 2; i++) {
            char left = arr[i];
            if (m[left - 'a'] == 1) {
                continue;
            }
            Set<Character> set = new HashSet<>();
            for (int j = i + 1; j < map.get(left); j++) {
                set.add(arr[j]);
            }
            res += set.size();
            m[left - 'a'] = 1;
        }
        return res;
    }
}
