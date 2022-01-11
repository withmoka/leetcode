package exam;

public class Solution3_6 {
    public static void calculate() {
        int[][] r = new int[4][4];
        r[1][2] = 5;
        r[1][3] = 15;
        r[2][3] = 7;
        int n = r.length;
        for (int k = 1; k < n - 1; k++) {
            for (int i = 0; i < n - k - 1; i++) {// 起始站(要空出相隔的和终点站）
                int j = i + k + 1;//终点站
                // 在起始站和终点站之间取cut
                for (int cut = i + 1; cut < j; cut++) {
                    int m = r[i][cut] + r[cut][j];
                    if (m < r[i][j]) {
                        r[i][j] = m;
                    }
                }

            }
        }
        System.out.println(r[1][3]);
    }

    public static void main(String[] args) {
        calculate();
    }
}
