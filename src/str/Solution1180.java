package str;

public class Solution1180 {
    public int countLetters(String s) {
        char[] arr = s.toCharArray();
        int count = 1;
        if (arr.length == 1) {
            return count;
        }
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                sum += helper(count);
                count = 1;
            }
            if (i == arr.length - 1) {
                sum += helper(count);
            }
        }
        return sum;
    }

    public int helper(int n) {
        return (n + 1) * n / 2;
    }
}
