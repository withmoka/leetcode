package hard;

public class Solution2180 {
    public int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (getSum(i) % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    public int getSum(int n) {
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n = n / 10;
        }
        return s;
    }
}
