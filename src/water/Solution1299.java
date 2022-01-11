package water;

public class Solution1299 {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];
        for (int i = 0; i < len - 1; i++) {
            int max = arr[i + 1];
            for (int j = i + 1; j < len; j++) {
                max = Math.max(max, arr[j]);
            }
            res[i] = max;
        }
        res[len - 1] = -1;
        return res;
    }
}
