package arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution1640 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] piece : pieces) {
            map.put(piece[0], Arrays.stream(piece).boxed().collect(Collectors.toList()));
        }
        int temp = 0;
        while (temp <= arr.length - 1) {
            if (map.containsKey(arr[temp])) {
                List<Integer> list = map.get(arr[temp]);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) != arr[temp]) {
                        return false;
                    } else {
                        temp++;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
