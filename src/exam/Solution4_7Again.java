package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution4_7Again {
    // 返回总的服务时长
    public static int helper(List<Integer> list) {
        Collections.sort(list);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i) * (list.size() - i);
        }
        return sum;
    }

    public static double service(int[] arr, int s) {
        Arrays.sort(arr);
        int res = 0;
        for (int start = 0; start < s; start++) {
            List<Integer> list = new ArrayList<>();
            for (int j = start; j < arr.length; j += s) {
                list.add(arr[j]);
            }
            res += helper(list);
        }
        return res * 1.0 / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {56, 12, 1, 99, 1000, 234, 33, 55, 99, 812};
        int s = 2;
        double res = service(arr, s);
        System.out.println(res);
    }
}
