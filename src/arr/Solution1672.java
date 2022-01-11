package arr;

public class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int temp = 0;
            for (int j = 0; j < account.length; j++) {
                temp += account[j];
            }
            max = Math.max(temp, max);
        }
        return max;
    }
}
