package twopointers;

import java.util.HashMap;
import java.util.Map;

public class Solution003 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        //可以保证字符串长度至少为1
        int max = 0;
        int left = 0;
        //left作为左指针，i作为右指针
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //如果map中已经有了这个字符，那去找到对应的位置
            if (map.containsKey(ch)) {
                //问题来了，为什么不是直接写left = map.get(ch)+1?
                //注意！举例：abba
                //新的left必须要大于等于当前的left，left不能比当前的left更小
                //但是如上述这种情况是有可能出现的
                left = Math.max(left,map.get(ch)+1);
            }
            //如果map中还没有这个字符，那就记录下来
            map.put(ch, i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
