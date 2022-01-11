package arr;

import java.util.HashSet;
import java.util.Set;

public class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        char[] arr = allowed.toCharArray();
        for (char ch : arr) {
            set.add(ch);
        }
        int count = 0;
        for (String word : words) {
            boolean flag = true;
            char[] temp = word.toCharArray();
            for (char ch : temp) {
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
