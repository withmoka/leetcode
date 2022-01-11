package arr;

public class Solution1732 {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int cur = 0;
        for (int i : gain) {
            cur = cur + i;
            max = Math.max(max, cur);
        }
        return max;
    }
}
