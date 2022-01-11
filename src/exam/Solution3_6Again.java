package exam;

public class Solution3_6Again {
    public static int helper(int[][] r) {
        int n = r[0].length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 2; j < n; j++) {
                for (int k = i + 1; k < j; k++) {
                    int m = r[i][k] + r[k][j];
                    if (m < r[i][j]) {
                        r[i][j] = m;
                    }
                }
            }
        }
        return r[0][2];
    }

    public static void main(String[] args) {
        int[][] r = new int[3][3];
        r[0][1] = 5;
        r[0][2] = 15;
        r[1][2] = 7;
        int res = helper(r);
        System.out.println(res);
    }
}
