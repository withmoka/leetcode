package exam;

import java.util.HashMap;
import java.util.Map;

public class Solution2_1Again {
    public static void helper(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        int max = 0;
        int number = -1;
        for (int key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                number = key;
            }
        }
        System.out.println(number);
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 5};
        helper(arr);
    }
}
