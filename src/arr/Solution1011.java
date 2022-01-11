package arr;

import java.util.Arrays;

public class Solution1011 {
    public int shipWithinDays(int[] weights, int days) {
        int max = Arrays.stream(weights).max().getAsInt();
        int sum = Arrays.stream(weights).sum();
        for (int i = max; i <= sum; i++) {
            int day = 1;
            int temp = 0;
            for (int weight : weights) {
                if (temp + weight <= i) {
                    temp = temp + weight;
                } else {
                    temp = weight;
                    day++;
                }
            }
            if (day <= days) {
                return i;
            }
        }
        return -1;
    }
}
