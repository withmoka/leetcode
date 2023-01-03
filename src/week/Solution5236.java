package week;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution5236 {
    public static int minDeletion(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int ele : nums) {
            set.add(ele);
        }
        if (set.size() == 1) {
            return nums.length;
        }
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int ele : nums) {
            list.add(ele);
        }
        while (list.size() > 0) {
            boolean flag = true;
            for (int i = 0; i < list.size(); i += 2) {
                if (i != list.size() - 1 && list.get(i) == list.get(i + 1)) {
                    list.remove(i);
                    count++;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (list.size() % 2 == 0) {
            return count;
        }
        return count + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 3, 5};
        int res = minDeletion(arr);
        System.out.println(res);
    }
}
