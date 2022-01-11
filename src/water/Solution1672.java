package water;

import java.util.stream.IntStream;

public class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int len = accounts.length;
        for (int i = 0; i < len; i++) {
            int[] row = accounts[i];
            int money = IntStream.of(row).sum();
            max = Math.max(max, money);
        }
        return max;
    }
}
