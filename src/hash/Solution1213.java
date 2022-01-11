package hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution1213 {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int ele : arr1) {
            set1.add(ele);
        }
        for (int ele : arr2) {
            if (set1.contains(ele)) {
                set2.add(ele);
            }
        }
        for (int ele : arr3) {
            if (set2.contains(ele)) {
                res.add(ele);
            }
        }
        return res;
    }
}
