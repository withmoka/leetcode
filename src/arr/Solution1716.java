package arr;

public class Solution1716 {
    public static int totalMoney(int n) {
        int sum = 0;
        int temp = 1 + 2 + 3 + 4 + 5 + 6 + 7;
        int weeks = n / 7;
        int left = n % 7;
        sum += temp * weeks;
        for (int i = 0; i < weeks; i++) {
            sum += 7 * i;
            System.out.println(sum);
        }
        for (int i = 0; i < left; i++) {
            sum += (i + 1 + weeks);
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 20;
        int res = totalMoney(n);
        System.out.println(res);
    }
}
