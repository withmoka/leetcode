package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1002 {
    public List<String> commonChars(String[] A) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        for (String str : A) {
            char[] arr = str.toCharArray();
            int[] freq = new int[26];
            for (char ch : arr) {
                freq[ch - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(freq[i], minFreq[i]);
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            int count = minFreq[i];
            for (int j = 0; j < count; j++) {
                list.add(String.valueOf((char) (i + 'a')));
            }
        }
        return list;
    }
}
