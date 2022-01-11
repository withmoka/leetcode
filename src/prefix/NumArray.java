package prefix;

class NumArray {

    private int[] pre;

    public NumArray(int[] nums) {
        int len = nums.length;
        if (nums.length == 0) {
            return;
        }
        pre = new int[len + 1];
        for (int i = 1; i < len + 1; i++) {
            pre[i] = pre[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return pre[right + 1] - pre[left];
    }
}
