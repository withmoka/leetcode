package arr;

public class Solution2028 {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int[] res = {};
        int m = rolls.length;
        int sum = (m + n) * mean;
        int left = sum;
        for (int ele : rolls) {
            left -= ele;
        }
        // 把left这个值分摊到n个位置上，并且每个位置1-6之间
        if (left < n || left > 6 * n) {
            return res;
        }
        int[] result = new int[n];
        int tmp = left;
        while (tmp > 0) {
            if (tmp < 6 && (tmp + result[n - 1]) <= 6) {
                result[n - 1] += tmp;
                break;
            }
            for (int i = 0; i < result.length; i++) {
                result[i] += tmp / n;
            }
            tmp -= n * (tmp / n);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,2,3,6,5,4,6,4,5,1,6,3,1,4,5,5,3,2,3,5,3,2,1,5,4,3,5,1,5};
        int mean = 4;
        int n = 40;
        int[] res = missingRolls(arr, mean, n);
        for (int ele : res) {
            System.out.println(ele);
        }
    }
}
