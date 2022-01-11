package prefix;

public class Solution370 {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] res = new int[length];
        int[] temp = new int[length];
        for (int[] update : updates) {
            int left = update[0];
            int right = update[1];
            int value = update[2];
            temp[left] += value;
            if (right + 1 < length) {
                temp[right + 1] -= value;
            }
        }
        res[0] = temp[0];
        for (int i = 1; i < length; i++) {
            res[i] = res[i - 1] + temp[i];
        }
        return res;
    }
}
