package water;

import java.util.Arrays;

public class Solution1833 {
    public int maxIceCream(int[] costs, int coins) {
        int cost = 0;
        int count = 0;
        Arrays.sort(costs);
        for (int i = 0; i < costs.length && (cost + costs[i]) <= coins; i++) {
            cost += costs[i];
            count++;
        }
        return count;
    }
}
