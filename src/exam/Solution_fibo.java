package exam;

public class Solution_fibo {
    public static int helper(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return helper(n - 1) + helper(n - 2);
    }

    public static void main(String[] args) {
        int res = helper(8);
        System.out.println(res);
    }
}
