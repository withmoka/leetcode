package arr;

public class Solution888 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        int[] res = new int[2];
        for (int num : aliceSizes) {
            sumA += num;
        }
        for (int num : bobSizes) {
            sumB += num;
        }
        for (int num : aliceSizes) {
            for (int ele : bobSizes) {
                if ((num - ele) * 2 == sumA - sumB) {
                    res[0] = num;
                    res[1] = ele;
                }
            }
        }
        return res;
    }
}
