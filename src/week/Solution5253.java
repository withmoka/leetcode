package week;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution5253 {
    public static boolean isBack(long num) {
        long before = num;
        long count = 0;
        while (num > 0) {
            count *= 10;
            count += num % 10;
            num = num / 10;
        }
        return count == before;
    }

    public static long[] kthPalindrome(int[] queries, int intLength) {
        int len = queries.length;
        long[] res = new long[len];
        List<Long> list = new ArrayList<>();
        int count = 0;
        int start = (int) Math.pow(10, (intLength - 1));
        int end = (int) Math.pow(10, intLength) - 1;
        System.out.println(start);
        System.out.println(end);
        for (long i = start; i <= end; i++) {
            if (isBack(i)) {
                count++;
                list.add(i);
            }
        }
        for (int i = 0; i < len; i++) {
            if ((queries[i] - 1) <= list.size() - 1) {
                res[i] = list.get(queries[i] - 1);
            } else {
                res[i] = -1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] queries = new int[]{2, 201429812, 8, 520498110, 492711727, 339882032, 462074369, 9, 7, 6};
        int intLength = 1;
        long[] res = kthPalindrome(queries, intLength);
        System.out.println(res);
    }
}
