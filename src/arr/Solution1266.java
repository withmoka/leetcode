package arr;

public class Solution1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int[] start = points[i];
            int[] end = points[i + 1];
            int dx = Math.abs(start[0] - end[0]);
            int dy = Math.abs(start[1] - end[1]);
            sum = sum + Math.max(dx, dy);
        }
        return sum;
    }
}
