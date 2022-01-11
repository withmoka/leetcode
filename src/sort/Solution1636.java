package sort;


import java.util.HashMap;
import java.util.Map;

public class Solution1636 {
    public int[] frequencySort(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Map<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            if (!map.containsKey(ele)) {
                map.put(ele, 1);
            } else {
                map.put(ele, map.get(ele) + 1);
            }
        }
        return res;
    }
}