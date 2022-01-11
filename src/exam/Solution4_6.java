package exam;

import java.util.Arrays;

public class Solution4_6 {
    public static void helper(int[] arr) {
        Arrays.sort(arr);
        // 1,24,56,78,99
        // 1*5+24*4+56*3+78*2+99*1
        // 服务自己的时候也算在等待
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * (arr.length - i);
        }
        double ave = (double) (sum * 1.0 / arr.length);
        System.out.println(ave);
    }

    public static void main(String[] args) {
        int[] arr = {56, 12, 1, 99, 1000, 234, 33, 55, 99, 812};
        helper(arr);
    }
}
