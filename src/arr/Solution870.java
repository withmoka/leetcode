package arr;

import java.util.*;

public class Solution870 {

    public static int[] advantageCount(int[] nums1, int[] nums2) {
        int len = nums1.length;
        int[] cp = Arrays.copyOf(nums2, len);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int up = 0;
        int down = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> extra = new ArrayList<>();
        while (up < len) {
            if (nums1[up] > nums2[down]) {
                List<Integer> temp = map.getOrDefault(nums2[down], new ArrayList<>());
                temp.add(nums1[up]);
                map.put(nums2[down], temp);
                down++;
            } else {
                extra.add(nums1[up]);
            }
            up++;
        }
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            if (map.containsKey(cp[i])) {
                List<Integer> cur = map.get(cp[i]);
                res[i] = cur.get(0);
                cur.remove(0);
                if (cur.size() == 0) {
                    map.remove(cp[i]);
                }
            } else {
                res[i] = extra.get(0);
                extra.remove(0);
            }
        }
        return res;
    }
}
