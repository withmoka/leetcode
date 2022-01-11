package prefix;

public class Solution1094 {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] road = new int[1000 + 1];
        for (int[] trip : trips) {
            road[trip[1]] += trip[0];
            road[trip[2]] -= trip[0];
        }
        int passenger = 0;
        for (int num : road) {
            if (passenger > capacity) {
                return false;
            }
            passenger += num;
        }
        return true;
    }
}
