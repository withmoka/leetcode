package prefix;

public class Solution1423 {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int[] left = new int[len + 1];
        int[] right = new int[len + 1];
        for (int i = 1; i < len + 1; i++) {
            left[i] = left[i - 1] + cardPoints[i - 1];
        }
        for (int i = 1; i < len + 1; i++) {
            right[i] = right[i - 1] + cardPoints[len - i];
        }
        int max = 0;
        for (int i = 0; i <= k; i++) {
            int cur = left[i] + right[k - i];
            max = Math.max(max, cur);
        }
        return max;
    }
}
