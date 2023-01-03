package arr;

public class Solution397 {
    public static int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return integerReplacement(n / 2) + 1;
        } else {
            return Math.min(integerReplacement(n - 1), integerReplacement(n + 1)) + 1;
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int res = integerReplacement(n);
        System.out.println(res);
    }
}
