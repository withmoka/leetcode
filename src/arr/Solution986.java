package arr;

import java.util.ArrayList;
import java.util.List;

public class Solution986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();
        for (int[] first : firstList) {
            for (int[] second : secondList) {
                int[] cur = new int[2];
                boolean flag = false;
                if (first[0] <= second[0] && first[1] <= second[1] && second[0] <= first[1]) {
                    flag = true;
                    cur[0] = second[0];
                    cur[1] = first[1];
                }
                if (second[0] <= first[0] && second[1] <= first[1] && first[0] <= second[1]) {
                    cur[0] = first[0];
                    cur[1] = second[1];
                    flag = true;
                }
                if (first[0] <= second[0] && first[1] >= second[1]) {
                    cur[0] = second[0];
                    cur[1] = second[1];
                    flag = true;
                }
                if (second[0] <= first[0] && second[1] >= first[1]) {
                    cur[0] = first[0];
                    cur[1] = first[1];
                    flag = true;
                }
                if (flag) {
                    list.add(cur);
                }
            }
        }
        int len = list.size();
        int[][] res = new int[len][2];
        for (int i = 0; i < len; i++) {
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }
        return res;
    }
}
