package prefix;

public class Solution1894 {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long[] pre = new long[n + 1];
        for (int i = 1; i < n + 1; i++) {
            pre[i] = pre[i - 1] + chalk[i - 1];
        }
        long left = k % pre[n];
        for (int i = 1; i < pre.length; i++) {
            if (left < pre[i]) {
                return i - 1;
            }
        }
        return -1;
    }
}
