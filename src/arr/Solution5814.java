package arr;

public class Solution5814 {
    public int addRungs(int[] rungs, int dist) {
        int count = 0;
        if (rungs[0] >= dist) {
            count += rungs[0] / dist;
        }
        if (rungs[0] % dist == 0) {
            count--;
        }
        for (int i = 1; i < rungs.length; i++) {
            int diff = rungs[i] - rungs[i - 1];
            if (diff < dist) {
                continue;
            }
            count += diff / dist;
            if (diff % dist == 0) {
                count--;
            }
        }
        return count;
    }
}
