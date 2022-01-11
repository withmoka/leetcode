package arr;

public class Solution1854 {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[110];
        for (int[] log : logs) {
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }
        int res = 0;
        int sum = 0;
        int temp = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + years[i];
            if (sum > temp) {
                temp = sum;
                res = i + 1950;
            }
        }
        return res;
    }
}
