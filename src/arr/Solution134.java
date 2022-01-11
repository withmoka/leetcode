package arr;

public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        for (int i = 0; i < len; i++) {
            if ((gas[i] - cost[i]) < 0) {
                continue;
            }
            int index = 1;
            int sum = gas[i] - cost[i];
            boolean flag = true;
            while (index < len + 1) {
                int j = (i + index) % len;
                sum += gas[j] - cost[j];
                if (sum < 0) {
                    flag = false;
                    break;
                }
                index++;
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
