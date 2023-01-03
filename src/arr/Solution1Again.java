package arr;

import java.util.HashMap;
import java.util.Map;

//nums = [2,7,11,15], target = 9
public class Solution1Again {
    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                System.out.println("第"+i+"次，进入循环");
                indexs[0] = i; // 当下的位置，比如7所在位置为1
                indexs[1] = map.get(nums[i]); // 在map中存储的，有一个位置的补数为7
                return indexs;
            }
            map.put(target - nums[i], i);
            System.out.println(target-nums[i]);
            System.out.println(i);
        }
        return indexs;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(arr, target);
        System.out.println("finish!");
    }
}
