package arr;

public class Solution1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            String str = String.valueOf(num);
            int len = str.length();
            if (len % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
