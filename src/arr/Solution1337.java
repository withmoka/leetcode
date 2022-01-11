package arr;

import java.util.*;

public class Solution1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] temp = new int[m][2];
        for (int i = 0; i < m; i++) {
            temp[i][0] = i;
            temp[i][1] = 0;
            int j = 0;
            for (j = 0; j < n && mat[i][j] == 1; j++) {
                ;
            }
            temp[i][1] = j;
        }
        Arrays.sort(temp, (o1, o2) -> o1[1] - o2[1]);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = temp[i][0];
        }
        return res;
    }
}
