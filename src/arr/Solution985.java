package arr;

public class Solution985 {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        int len = queries.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int[] query = queries[i];
            int val = query[0];
            int index = query[1];
            if (nums[index] % 2 == 0) {
                sum = sum - nums[index];
            }
            nums[index] = nums[index] + val;
            if (nums[index] % 2 == 0) {
                sum = sum + nums[index];
            }
            res[i] = sum;
        }
        return res;
    }
}
