package slide;

import java.util.*;

public class Solution632 {
    public int[] smallestRange(List<List<Integer>> nums) {
        int len = 0;
        for (List<Integer> num : nums) {
            len += num.size();
        }
        int[][] temp = new int[len][2];
        int index = 0;
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> num = nums.get(i);
            for (int ele : num) {
                temp[index][0] = ele;
                temp[index][1] = i;
                index++;
            }
        }
        Arrays.sort(temp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int left = 0;
        int min = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(temp[i][1], map.getOrDefault(temp[i][1], 0) + 1);
            while (map.size() == nums.size()) {
                int dis = temp[i][0] - temp[left][0];
                if (dis < min) {
                    min = dis;
                    l = temp[left][0];
                    r = temp[i][0];
                }
                map.put(temp[left][1], map.get(temp[left][1]) - 1);
                if (map.get(temp[left][1]) == 0) {
                    map.remove(temp[left][1]);
                }
                left++;
            }
        }
        int[] res = new int[2];
        res[0] = l;
        res[1] = r;
        return res;
    }
}
