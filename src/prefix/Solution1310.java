package prefix;

public class Solution1310 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int len = arr.length;
        int[] pre = new int[len + 1];
        for (int i = 1; i < len + 1; i++) {
            pre[i] = pre[i - 1] ^ arr[i - 1];
        }
        int n = queries.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            res[i] = pre[left] ^ pre[right + 1];
        }
        return res;
    }
}
