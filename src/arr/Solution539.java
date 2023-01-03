package arr;

import java.util.*;

public class Solution539 {
    public int findMinDifference(List<String> timePoints) {
        // "23:59"
        List<Integer> list = new ArrayList<>();
        for (String s : timePoints) {
            int a = Character.getNumericValue(s.charAt(0));
            int b = Character.getNumericValue(s.charAt(1));
            int c = Character.getNumericValue(s.charAt(3));
            int d = Character.getNumericValue(s.charAt(4));
            int num = (a * 10 + b) * 60 + c * 10 + d;
            list.add(num);
        }
        Collections.sort(list);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            res = Math.min(res, list.get(i) - list.get(i - 1));
        }
        res = Math.min(res, list.get(0) + 24 * 60 - list.get(list.size() - 1));
        return res;
    }
}
