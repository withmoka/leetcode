package prefix;

public class SolutionOffer66 {
    public int[] constructArr(int[] a) {
        int len = a.length;
        if (len <= 0) {
            return a;
        }
        int[] left = new int[len + 1];
        int[] right = new int[len + 1];
        left[0] = 1;
        for (int i = 1; i < len + 1; i++) {
            left[i] = left[i - 1] * a[i - 1];
        }
        right[0] = 1;
        for (int i = 1; i < len + 1; i++) {
            right[i] = right[i - 1] * a[len - i];
        }
        int[] res = new int[len];
        res[0] = right[len - 1];
        res[len - 1] = left[len - 1];
        for (int i = 1; i < len - 1; i++) {
            res[i] = left[i] * right[len - 1 - i];
        }
        return res;
    }
}
