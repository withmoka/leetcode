package sort;

import java.util.Arrays;

public class Solution1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int dis = arr[0] - arr[1];
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] - arr[i + 1]) != dis) {
                return false;
            }
        }
        return true;
    }
}
