package prefix;

public class Solution1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int len = 1; i + len - 1 <= arr.length - 1; len = len + 2) {
                for (int j = i; j <= i + len - 1; j++) {
                    sum += arr[j];
                }
            }
        }
        return sum;
    }
}
