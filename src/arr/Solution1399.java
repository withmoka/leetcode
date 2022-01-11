package arr;

public class Solution1399 {
    public int countLargestGroup(int n) {
        int[] temp = new int[40];
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int k = i;
            int sum = 0;
            while (k != 0) {
                sum = sum + k % 10;
                k = k / 10;
            }
            temp[sum]++;
            max = Math.max(max, temp[sum]);
        }
        int count = 0;
        for (int ele : temp) {
            if (ele == max) {
                count++;
            }
        }
        return count;
    }
}
