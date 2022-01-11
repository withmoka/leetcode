package sort;

import java.util.*;

public class Solution1086 {
    public int[][] highFive(int[][] items) {
        List<Integer> stu = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] item : items) {
            int num = item[0];
            int score = item[1];
            if (!map.containsKey(num)) {
                stu.add(num);
                List<Integer> list = new ArrayList<>();
                list.add(score);
                map.put(num, list);
            } else {
                List<Integer> list = map.get(num);
                list.add(score);
                if (list.size() > 5) {
                    Collections.sort(list);
                    list.remove(0);
                }
            }
        }
        Collections.sort(stu);
        int len = stu.size();
        int[][] res = new int[len][2];
        for (int i = 0; i < stu.size(); i++) {
            int num = stu.get(i);
            res[i][0] = num;
            List<Integer> list = map.get(num);
            int ave = 0;
            for (int j = 0; j < 5; j++) {
                ave = list.get(j) + ave;
            }
            ave = ave / 5;
            res[i][1] = ave;
        }
        return res;
    }
}
