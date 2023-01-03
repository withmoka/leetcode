package arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution905Again {
    public static int[] sortArrayByParity(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int ele : nums) {
            if (ele % 2 == 0) {
                even.add(ele);
            } else {
                odd.add(ele);
            }
        }
        int[] res = new int[nums.length];
        int i = 0;
        for (i = 0; i < even.size(); i++) {
            res[i] = even.get(i);
        }
        int tmp = i;
        for (; i < res.length; i++) {
            res[i] = odd.get(i - tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] res = sortArrayByParity(nums);
        System.out.println(Arrays.toString(res));
    }
}
