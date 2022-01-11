package prefix;

public class Solution1732 {
    public int largestAltitude(int[] gain) {
        int res = 0, temp = 0;
        for (int height : gain) {
            temp = temp + height;
            res = Math.max(res, temp);
        }
        return res;
    }
}
