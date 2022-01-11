package str;

import java.util.HashSet;
import java.util.Set;

public class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        char[] root = allowed.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char ch : root) {
            set.add(ch);
        }
        for (String word : words) {
            boolean flag = true;
            char[] arr = word.toCharArray();
            for (char ch : arr) {
                if (!set.contains(ch)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}
