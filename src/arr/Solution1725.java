package arr;

public class Solution1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int count = 1;
        for (int[] rectangle : rectangles) {
            int temp = 0;
            int a = rectangle[0];
            int b = rectangle[1];
            if (a < b) {
                temp = a;
            } else {
                temp = b;
            }
            if (temp == max) {
                count++;
            } else if (temp > max) {
                count = 1;
                max = temp;
            }
        }
        return count;
    }
}
