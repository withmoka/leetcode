package exam;

import java.util.Arrays;

public class Solution4_5 {
    public static void helper(int[] arr, int L) {
        Arrays.sort(arr);
        int sum = 0;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > L) {
                break;
            }
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 13, 8, 80, 20};
        int L = 50;
        helper(arr, L);
    }
}
