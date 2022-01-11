package str;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1221 {
    public int balancedStringSplit(String s) {
        char[] arr = s.toCharArray();
        int r = 0;
        int l = 0;
        int res = 0;
        for (char ch : arr) {
            if (ch == 'R') {
                r++;
            } else {
                l++;
            }
            if (r != 0 && r == l) {
                res++;
                r = 0;
                l = 0;
            }
        }
        return res;
    }
}
