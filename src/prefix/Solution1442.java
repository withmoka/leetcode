package prefix;

public class Solution1442 {
    public int countTriplets(int[] arr) {
        int res = 0;
        int n = arr.length;
        int[] preXOR = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            preXOR[i] = preXOR[i - 1] ^ arr[i - 1];
        }
        for (int i = 0; i < n - 1; i++) {
            for (int k = i + 1; k < n; k++) {
                if (preXOR[i] == preXOR[k + 1]) {
                    res += k - i;
                }
            }
        }
        return res;
    }
}
