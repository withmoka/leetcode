package water;

public class Solution_LCP6 {
    public int minCount(int[] coins) {
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] % 2 == 0) {
                count += coins[i] / 2;
            } else {
                count += (coins[i] + 1) / 2;
            }
        }
        return count;
    }
}
