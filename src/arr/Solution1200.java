package arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int dis = arr[i + 1] - arr[i];
            min = Math.min(min, dis);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == min) {
                List<Integer> ele = new ArrayList<>();
                ele.add(arr[i]);
                ele.add(arr[i + 1]);
                list.add(ele);
            }
        }
        return list;
    }
}
