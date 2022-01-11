package arr;

import java.util.Arrays;
import java.util.Comparator;

public class Solution5805 {
    public int smallestChair(int[][] times, int targetFriend) {
        int len = times.length;
        int[] map = new int[len];
        //预期的人到达的时间点记录
        int tArrival = times[targetFriend][0];
        //times 按照到达时间进行排序
        Arrays.sort(times, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int[] time : times) {
            for (int i = 0; i < len; i++) {
                if (map[i] == 0) {
                    map[i] = time[1];
                    if (time[0] == tArrival) {
                        return i;
                    }
                    break;
                } else if (map[i] <= time[0]) {
                    map[i] = time[1];
                    if (time[0] == tArrival) {
                        return i;
                    }
                    break;
                }
            }
        }
        return -1;
    }
}
