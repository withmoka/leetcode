package arr;

import java.util.HashMap;
import java.util.Map;

public class Solution806 {
    public int[] numberOfLines(int[] widths, String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < widths.length; i++) {
            map.put((char) (i + 'a'), widths[i]);
        }
        char[] arr = s.toCharArray();
        int temp = 0;
        int count = 0;
        for (char ch : arr) {
            if ((temp + map.get(ch)) > 100) {
                temp = 0;
                count++;
            }
            temp += map.get(ch);
        }
        int[] res = new int[2];
        res[0] = count + 1;
        res[1] = temp;
        return res;
    }
}
