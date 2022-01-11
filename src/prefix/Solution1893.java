package prefix;

public class Solution1893 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] map = new int[51];
        for (int[] range : ranges) {
            map[range[0]]++;
            if (range[1] < 50) {
                map[range[1] + 1]--;
            }
        }
        int[] pre = new int[52];
        for (int i = 1; i < 52; i++) {
            pre[i] = pre[i - 1] + map[i - 1];
        }
        for (int i = left; i <= right; i++) {
            if (pre[i + 1] == 0) {
                return false;
            }
        }
        return true;
    }
}
