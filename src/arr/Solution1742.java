package arr;

public class Solution1742 {
    public int countBalls(int lowLimit, int highLimit) {
        int max = Integer.MIN_VALUE;
        int[] box = new int[50];
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0;
            int temp = i;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            box[sum]++;
            max = Math.max(max, box[sum]);
        }
        return max;
    }
}
