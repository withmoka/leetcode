package arr;

public class Solution1539 {
    public int findKthPositive(int[] arr, int k) {
        int missCount = 0, ptr = 0, miss = -1;
        int cur = 1;
        for (missCount = 0; missCount < k; cur++) {
            if (arr[ptr] == cur) {
                ptr++;
                if (ptr == arr.length) {
                    ptr--;
                }
            } else {
                miss = cur;
                missCount++;
            }
        }
        return miss;
    }
}
