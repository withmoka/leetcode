package exam;

public class Solution_binary {
    public static void helper(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == target) {
                System.out.println(middle);
                return;
            }
            // 中间值大了，去左边区间找
            if (arr[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        // 跳出循环的时候是left>right的时候，这时它们交换一下就是正确的，left对应9，right对应11，刚好是题目要求的。
        System.out.println(right);
        System.out.println(left);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 11, 12};
        helper(arr, 0, 4, 9);
    }
}
