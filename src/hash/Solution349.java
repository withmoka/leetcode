package hash;

import java.util.HashSet;
import java.util.Set;

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        for (int num : set1) {
            if (set2.contains(num)) {
                set3.add(num);
            }
        }
        int len = set3.size();
        int[] res = new int[len];
        int index = 0;
        for (int num : set3) {
            res[index++] = num;
        }
        return res;
    }
}
