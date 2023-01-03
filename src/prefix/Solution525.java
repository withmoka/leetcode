package prefix;

public class Solution525 {
    public static int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] sum0 = new int[n + 1];
        int[] sum1 = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            if (nums[i - 1] == 0) {
                sum0[i] = sum0[i - 1] + 1;
            } else {
                sum0[i] = sum0[i - 1];
            }
            if (nums[i - 1] == 1) {
                sum1[i] = sum1[i - 1] + 1;
            } else {
                sum1[i] = sum1[i - 1];
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    int num0 = sum0[j + 1] - sum0[i];
                    int num1 = sum1[j + 1] - sum1[i];
                    if (num0 == num1) {
                        res = Math.max(res, j - i + 1);
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1};
        int res = findMaxLength(arr);
    }
}
