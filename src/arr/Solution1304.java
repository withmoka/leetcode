package arr;

public class Solution1304 {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        if (n % 2 == 1) {
            for (int i = 1; i < n; i = i + 2) {
                res[i] = i;
                res[i + 1] = -i;
            }
        } else {
            for (int i = 0; i < n; i = i + 2) {
                res[i] = i + 1;
                res[i + 1] = -i - 1;
            }
        }
        return res;
    }
}
