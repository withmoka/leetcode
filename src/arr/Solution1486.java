package arr;

public class Solution1486 {
    public int xorOperation(int n, int start) {
        if (n == 1) {
            return start;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = start + 2 * i;
        }
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}
