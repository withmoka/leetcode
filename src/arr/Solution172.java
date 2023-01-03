package arr;

public class Solution172 {
    public static int trailingZeroes(int n) {
        if (n == 0) {
            return 0;
        }
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n = n/5;
        }
        return count;
    }


    public static void main(String[] args) {
        int n = 25;
        int res = trailingZeroes(n);
        System.out.println(res);
    }
}
