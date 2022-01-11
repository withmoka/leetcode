package sort;

import java.util.Arrays;

public class Solution1356 {
    public int[] sortByBits(int[] arr) {
        Integer[] Arr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(Arr, (o1, o2) -> {
            int cnt1 = Integer.bitCount(o1);
            int cnt2 = Integer.bitCount(o2);
            return cnt1 == cnt2 ? o1 - o2 : cnt1 - cnt2;
        });
        return Arrays.stream(Arr).mapToInt(Integer::intValue).toArray();
    }
}
