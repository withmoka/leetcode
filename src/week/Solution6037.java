package week;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution6037 {
    public static int largestInteger(int num) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        String str = String.valueOf(num);
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                even.add(arr[i] - '0');
            } else {
                odd.add(arr[i] - '0');
            }
        }
        Collections.sort(odd, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Collections.sort(even, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        StringBuffer sb = new StringBuffer();
        while (!odd.isEmpty() || !even.isEmpty()) {
            sb.append(odd.get(0));
            odd.remove(0);
            if (!even.isEmpty()) {
                sb.append(even.get(0));
                even.remove(0);
            }
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        int a = 65875;
        int res = largestInteger(a);
        System.out.println(res);
    }
}
