package DP;

class Solution70 {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int i1 = 1;
        int i2 = 2;
        int temp;
        for (int i = 3; i <= n; i++) {
            temp = i1 + i2;
            i1 = i2;
            i2 = temp;
        }
        return i2;
    }
}
