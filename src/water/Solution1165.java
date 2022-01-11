package water;

import java.util.HashMap;
import java.util.Map;

public class Solution1165 {
    public int calculateTime(String keyboard, String word) {
        // 将keyboard转为字符数组
        char[] arr = keyboard.toCharArray();
        // 一张哈希表 比如 a-0，b-1，c-2 ...
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(arr[i], i);
        }
        // 结果记作res
        int res = 0;
        // 把word也转为字符数组
        char[] arrWord = word.toCharArray();
        res = res + map.get(arrWord[0]);
        for (int i = 1; i < arrWord.length; i++) {
            res = res + Math.abs(map.get(arrWord[i]) - map.get(arrWord[i - 1]));
        }
        return res;
    }
}
