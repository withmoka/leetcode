package exam;

public class Solution2_10 {
    public static void mergeall(int[] a, int left, int right) {
        return;
    }

    // 根号n段合并排序算法
    public void mergesort(int[] a, int left, int right) {
        if (left < right) {
            int j = (int) Math.sqrt(right - left + 1);
            if (j > 1) {
                for (int i = 0; i < j; i++) {
                    mergesort(a, left + i * j, left + (i + 1) * j - 1);
                }
                mergesort(a, left + j * j, right);
            }
            mergeall(a, left, right);
        }
    }


}
