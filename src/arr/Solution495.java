package arr;

public class Solution495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            sum = sum + Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
        }
        sum += duration;
        return sum;
    }
}
