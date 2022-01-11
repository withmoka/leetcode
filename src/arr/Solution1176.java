package arr;

public class Solution1176 {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int grade = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += calories[i];
        }
        if (sum < lower) {
            grade--;
        } else if (sum > upper) {
            grade++;
        }
        for (int i = 1; i < calories.length - k + 1; i++) {
            sum -= calories[i - 1];
            sum += calories[i + k - 1];
            if (sum < lower) {
                grade--;
            } else if (sum > upper) {
                grade++;
            }
        }
        return grade;
    }
}
