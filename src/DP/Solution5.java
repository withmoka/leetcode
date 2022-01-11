package DP;

class Solution5 {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        for (int dis = 0; dis < n; dis++) {
            for (int i = 0; i + dis < n; i++) {
                int j = i + dis;
                if (dis == 0) {
                    dp[i][j] = true;
                } else if (dis == 1) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[i][j] = (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j));
                }
                if (dp[i][j] && dis + 1 > ans.length()) {
                    ans = s.substring(i, j + 1);
                }
            }
        }
        return ans;
    }
}
