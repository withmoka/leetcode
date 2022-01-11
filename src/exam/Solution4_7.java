package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4_7 {
    public static int helper(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * (arr.length - i);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 33, 56, 99, 812};
        int[] arr2 = {12, 55, 99, 234, 1000};
        int all = 0;
        all = helper(arr1) + helper(arr2);
        System.out.println(all / 10);
    }
}
