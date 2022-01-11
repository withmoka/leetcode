package arr;

public class Solution905 {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int head = 0;
        int tail = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                res[head++] = num;
            } else {
                res[tail--] = num;
            }
        }
        return res;
    }
}
