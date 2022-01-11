package arr;

public class Solution11 {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int res = Math.min(height[left], height[right]) * (right - left);
        while (left < right) {
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            int temp = Math.min(height[left], height[right]) * (right - left);
            res = Math.max(temp, res);
        }
        return res;
    }
}
