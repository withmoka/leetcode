package arr;

public class Solution762 {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            String s = Integer.toBinaryString(i);
            int num = 0;
            char[] arr = s.toCharArray();
            for (char c : arr) {
                if (c == '1') {
                    num++;
                }
            }
            if (helper(num)) {
                count++;
            }
        }
        return count;
    }

    public boolean helper(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
