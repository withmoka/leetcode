package arr;

public class Solution1652 {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] res = new int[len];
        if (k == 0) {
            return res;
        } else if (k > 0) {
            for (int i = 0; i < len; i++) {
                for (int j = 1; j <= k; j++) {
                    res[i] += code[(i + j) % len];
                }
            }
        } else {
            for (int i = 0; i < len; i++) {
                for (int j = 1; j <= Math.abs(k); j++) {
                    res[i] += code[(i - j + len) % len];
                }
            }
        }
        return res;
    }
}
