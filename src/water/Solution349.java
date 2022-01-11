package water;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution349 {
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
        for (int ele : set1) {
            if (set2.contains(ele)) {
                set3.add(ele);
            }
        }
        int len = set3.size();
        int[] ans = new int[len];
        int index = 0;
        for (int ele : set3) {
            ans[index++] = ele;
        }
        return ans;
    }
}
