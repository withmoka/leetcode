package arr;

public class Solution370Again {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] res = new int[length];
        int[] temp = new int[length];
        for (int[] update : updates) {
            temp[update[0]] += update[2];
            if (update[1] + 1 < length) {
                temp[update[1] + 1] -= update[2];
            }
        }
        res[0] = temp[0];
        for (int i = 1; i < length; i++) {
            res[i] = res[i - 1] + temp[i];
        }
        return res;
    }
}
