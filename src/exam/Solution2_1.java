package exam;

import java.util.HashMap;
import java.util.Map;


class Solution2_1 {
    public static void majorityElement(int nums[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        int ele = 0;
        // max 为最高重复次数,ele为对应元素
        for (int num : map.keySet()) {
            if (map.get(num) > max) {
                max = map.get(num);
                ele = num;
            }
        }
        System.out.println(ele);
        System.out.println(max);
    }

    public static void main(String[] args) {
        int nums[] = {6, 1, 2, 2, 2, 3, 3, 3, 3, 5};
        majorityElement(nums);
    }
}
