package prefix;

public class Solution1829 {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int len = nums.length;
        int[] res = new int[len];

        int maxK = (int) Math.pow(2, maximumBit) - 1;

        //pre[i]表示前i个元素的异或结果
        int[] pre = new int[len + 1];
        for (int i = 1; i < len + 1; i++) {
            pre[i] = pre[i - 1] ^ nums[i - 1];
        }

        //依次得到pre[len],pre[len-1],...,pre[1]即前len到前1个异或结果
        for (int i = len; i >= 1; i--) {
            res[len - i] = maxK ^ pre[i];
        }
        return res;
    }
}
