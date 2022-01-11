package str;

public class Solution657 {
    public boolean judgeCircle(String moves) {
        char[] arr = moves.toCharArray();
        int u = 0, d = 0, l = 0, r = 0;
        for (char ch : arr) {
            if (ch == 'U') {
                u++;
            } else if (ch == 'D') {
                d++;
            } else if (ch == 'L') {
                l++;
            } else if (ch == 'R') {
                r++;
            }
        }
        return u == d && l == r;
    }
}
