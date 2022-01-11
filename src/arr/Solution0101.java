package arr;

import java.util.HashSet;
import java.util.Set;

public class Solution0101 {
    public boolean isUnique(String astr) {
        char[] arr = astr.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char ch : arr) {
            if (!set.contains(ch)) {
                set.add(ch);
            } else {
                return false;
            }
        }
        return true;
    }
}
