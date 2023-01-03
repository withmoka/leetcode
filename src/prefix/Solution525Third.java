package prefix;

import java.util.HashMap;
import java.util.Map;

public class Solution525Third {
    public int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        int res = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        // ? map： key：sum value：index
        // [0,1]->[-1,1] 如果没有下面一句的话，sum就只有-1，0，取到0的时候不能去找，但是实际上，index=-1时，sum=0（一个都没取的时候）
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (!map.containsKey(sum)) {
                map.put(sum, i);
                // i这个点时，取到包含i及之前的总和为sum
            } else {
                res = Math.max(res, i - map.get(sum));
                // 以前的点是 map.get（sum）记为before。包含before+1到i（包含i）总和为0，长度为i-（before+1）+1 = i-before
            }
        }
        return res;
    }
}
