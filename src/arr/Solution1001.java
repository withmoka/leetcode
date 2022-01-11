package arr;

import java.util.Arrays;

public class Solution1001 {
    public void merge(int[] A, int m, int[] B, int n) {
        for (int i = m; i < A.length; i++) {
            A[i] = B[i - m];
        }
        Arrays.sort(A);
    }
}
