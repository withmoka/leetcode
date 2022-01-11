package arr;

public class Solution1287 {
    public int findSpecialInteger(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            return arr[0];
        }
        double target = len * 0.25;
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                if (count > target) {
                    return arr[i];
                }
            } else {
                count = 1;
            }
        }
        return 0;
    }
}
