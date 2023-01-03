package week;

import java.util.*;

public class Solution5268 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        for (int ele : nums1) {
            set1.add(ele);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int ele : nums2) {
            set2.add(ele);
        }
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        for (int ele : set1) {
            if (!set2.contains(ele)) {
                res1.add(ele);
            }
        }
        for (int ele : set2) {
            if (!set1.contains(ele)) {
                res2.add(ele);
            }
        }
        res.add(res1);
        res.add(res2);
        return res;
    }
}
