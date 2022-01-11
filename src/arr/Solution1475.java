package arr;

public class Solution1475 {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        if (len == 1) {
            return prices;
        }
        int[] res = new int[len];
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (prices[j] <= prices[i]) {
                    res[i] = prices[i] - prices[j];
                    break;
                }
                res[i] = prices[i];
            }
        }
        res[len - 1] = prices[len - 1];
        return res;
    }
}
