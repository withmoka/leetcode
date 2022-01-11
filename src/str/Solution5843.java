package str;

import java.util.HashSet;
import java.util.Set;

public class Solution5843 {
    public int numOfStrings(String[] patterns, String word) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                set.add(word.substring(i, j + 1));
            }
        }
        int count = 0;
        for (String pattern : patterns) {
            if (set.contains(pattern)) {
                count++;
            }
        }
        return count;
    }
}
