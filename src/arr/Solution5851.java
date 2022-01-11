package arr;

import java.util.ArrayList;
import java.util.List;

public class Solution5851 {
    public String findDifferentBinaryString(String[] nums) {
        int len = nums[0].length();
        int[] map = new int[(int) Math.pow(2, len)];
        for (String num : nums) {
            char[] arr = num.toCharArray();
            int sum = 0;
            for (int i = len - 1; i >= 0; i--) {
                sum += (arr[len - 1 - i] - '0') * (int) Math.pow(2, i);
            }
            map[sum] = 1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < (int) Math.pow(2, len); i++) {
            if (map[i] == 0) {
                while (i != 0) {
                    int left = i % 2;
                    list.add(0, left);
                    i = i / 2;
                }
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("0".repeat(Math.max(0, len - list.size())));
        for (Integer integer : list) {
            sb.append(integer);
        }
        return sb.toString();
    }
}
