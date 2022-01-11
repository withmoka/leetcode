package arr;

public class Solution1064 {
    public int fixedPoint(int[] arr) {
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                return res = i;
            }
        }
        return res;
    }
}
