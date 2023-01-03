package week;

import java.util.*;

public class Solution6031 {
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Map<Integer, int[]> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                map.put(i, new int[]{Math.max(-k + i, 0), Math.min(k + i, nums.length - 1)});
            }
        }
        for (int[] ele : map.values()) {
            for (int i = ele[0]; i <= ele[1]; i++) {
                set.add(i);
            }
        }
        List<Integer> res = new ArrayList<>(set);
        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 9, 1, 3, 9, 5};
        int key = 9;
        int k = 1;
        List<Integer> list = findKDistantIndices(nums, key, k);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
