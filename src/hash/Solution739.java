package hash;

public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        for (int i = 0; i < len - 1; i++) {
            int cur = temperatures[i];
            for (int j = i + 1; j < len; j++) {
                if (temperatures[j] > cur) {
                    res[i] = j - i;
                    break;
                }
            }
        }
        res[len - 1] = 0;
        return res;
    }
}
