package slide;

import java.util.HashSet;
import java.util.Set;

public class Solution1763 {
    public String longestNiceSubstring(String s) {
        String res = "";
        if (s.length() < 2) {
            return res;
        }
        for (int len = 2; len <= s.length(); len++) {
            for (int i = 0; i + len - 1 < s.length(); i++) {
                String subString = s.substring(i, i + len);
                if (subString.length() > res.length() && helper(subString)) {
                    res = subString;
                }
            }
        }
        return res;
    }

    public boolean helper(String s) {
        Set<Character> upperSet = new HashSet<>();
        Set<Character> lowerSet = new HashSet<>();
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            if (Character.isUpperCase(ch)) {
                upperSet.add(ch);
            } else {
                lowerSet.add(Character.toUpperCase(ch));
            }
        }
        if (upperSet.size()!=lowerSet.size()){
            return false;
        }
        upperSet.removeAll(lowerSet);
        return upperSet.isEmpty();
    }
}
