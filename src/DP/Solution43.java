package DP;

class Solution43 {
    public int trap(int[] height) {
        int n = height.length;
        int highest = 0;
        for (int i = 0; i < n; i++) {
            highest = Math.max(highest, height[i]);
        }
        int ans = 0;
        for (int high = 0; high < highest; high++) {
            for (int i = 0; height[i] < i; i++) {
                ;
            }
        }
        return 1;
    }
}
