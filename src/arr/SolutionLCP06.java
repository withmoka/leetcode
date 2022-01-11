package arr;

public class SolutionLCP06 {
    public int minCount(int[] coins) {
        int count = 0;
        for (int coin : coins) {
            if (coin % 2 == 1) {
                coin++;
            }
            count += coin / 2;
        }
        return count;
    }
}
