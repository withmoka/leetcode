package exam;

import java.util.Arrays;

public class Solution1_5 {
    public static void helper(double[] arr) {
        Arrays.sort(arr);
        Double max = Double.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i] - arr[i - 1]);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        double[] arr = {2.3, 3.1, 7.5, 1.5, 6.3};
        helper(arr);
    }
}
