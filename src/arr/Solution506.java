package arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution506 {
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        String[] res = new String[len];
        int[] cp = Arrays.copyOf(score, len);
        Arrays.sort(score);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(score[i], len - i);
        }
        int index = 0;
        for (int num : cp) {
            int rank = map.get(num);
            if (rank == 1) {
                res[index++] = new String("Gold Medal");
            } else if (rank == 2) {
                res[index++] = new String("Silver Medal");
            } else if (rank == 3) {
                res[index++] = new String("Bronze Medal");
            } else {
                res[index++] = new String(Integer.toString(rank));
            }
        }
        return res;
    }
}
