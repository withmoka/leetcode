package arr;

public class Solution2028Again {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int[] res = {};
        int m = rolls.length;
        int sum = (m + n) * mean;
        int left = sum;
        for (int ele : rolls) {
            left -= ele;
        }
        // 把left这个值分摊到n个位置上，并且每个位置1-6之间
        // 先铺一层1打底，剩下的 5 5 地加
        if (left < n || left > 6 * n) {
            return res;
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }
        int tmp = left - n;
        int length = tmp / 5;
        for (int i = 0; i < length; i++) {
            result[i] = 6;
        }
        if (tmp % 5 == 0) {
            return result;
        }
        result[length] += tmp % 5;
        return result;
    }
}
