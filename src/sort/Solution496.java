package sort;

public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len = nums1.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int number = nums1[i];
            res[i] = helper(number, nums2);
        }
        return res;
    }

    public int helper(int a, int[] nums2) {
        int len = nums2.length;
        int i = -1;
        for (i = 0; i < len; i++) {
            if (nums2[i] == a) {
                break;
            }
        }
        if (i == len - 1) {
            return -1;
        }
        for (int j = i; j < len; j++) {
            if (nums2[j] > a) {
                return nums2[j];
            }
        }
        return -1;
    }
}
