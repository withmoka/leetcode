package str;

import java.util.HashSet;
import java.util.Set;

public class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String[] map = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...",
                "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            char[] arr = word.toCharArray();
            for (char ch : arr) {
                int num = ch - 'a';
                sb.append(map[num]);
            }
            String s = sb.toString();
            set.add(s);
        }
        return set.size();
    }
}
