package sort;

public class Solution1491 {
    public double average(int[] salary) {
        int len = salary.length - 2;
        int sum = 0, min = salary[0], max = salary[0];
        for (int ele : salary) {
            sum += ele;
            min = Math.min(min, ele);
            max = Math.max(max, ele);
        }
        sum = sum - min - max;
        return sum * 1.0 / len;
    }
}
