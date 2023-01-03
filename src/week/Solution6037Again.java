package week;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution6037Again {
    public static int largestInteger(int num) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> oddLoc = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> evenLoc = new ArrayList<>();
        String str = String.valueOf(num);
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i] - '0';
            if (ele % 2 != 0) {
                odd.add(ele);
                oddLoc.add(i);
            } else {
                even.add(ele);
                evenLoc.add(i);
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
        int[] res = new int[arr.length];
        int count = 0;
        for (int loc : oddLoc) {
            res[loc] = odd.get(count);
            count++;
        }
        count = 0;
        for (int loc : evenLoc) {
            res[loc] = even.get(count);
            count++;
        }
        for (int ele : res) {
            sb.append(ele);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        int a = 247;
        int res = largestInteger(a);
        System.out.println(res);
    }
}
