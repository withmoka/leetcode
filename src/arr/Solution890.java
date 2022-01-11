package arr;

import java.util.*;

public class Solution890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (helper(word, pattern)) {
                res.add(word);
            }
        }
        return res;
    }

    public boolean helper(String word, String pattern) {
        char[] arr1 = word.toCharArray();
        char[] arr2 = pattern.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                map.put(arr1[i], arr2[i]);
                if (set.contains(arr2[i])) {
                    return false;
                }
                set.add(arr2[i]);
            } else {
                if (!map.get(arr1[i]).equals(arr2[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
