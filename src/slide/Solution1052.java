package slide;

public class Solution1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int len = customers.length;
        int max = 0;
        int res = 0;
        for (int i = 0; i < len; i++) {
            if (grumpy[i] == 0) {
                max += customers[i];
            }
        }
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                max += customers[i];
            }
        }
        res = max;
        if (minutes == customers.length) {
            return res;
        }
        int left = 0;
        for (int i = minutes; i < len; i++) {
            if (grumpy[i] == 1) {
                max += customers[i];
            }
            if (grumpy[left] == 1) {
                max -= customers[left];
            }
            res = Math.max(res, max);
            left++;
        }
        return res;
    }
}
