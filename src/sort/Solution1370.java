package sort;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution1370 {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int[] map = new int[26];
        for (char ch : arr) {
            map[ch - 'a']++;
        }
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < 26; i++) {
                if (map[i] != 0) {
                    sb.append((char) (i + 'a'));
                    map[i]--;
                    flag = true;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (map[i] != 0) {
                    sb.append((char) (i + 'a'));
                    map[i]--;
                    flag = true;
                }
            }
        } while (flag);
        return sb.toString();
    }
}
