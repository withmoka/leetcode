package arr;


import java.util.*;

public class Solution {
    private Map<Integer, List<Integer>> map;
    private Random random;

    public Solution(int[] nums) {
        map = new HashMap<>();
        random = new Random();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
    }

    public int pick(int target) {
        List<Integer> list = map.get(target);
        Random random = new Random();
        int n = random.nextInt(list.size());
        int res = list.get(n);
        return res;
    }
}
