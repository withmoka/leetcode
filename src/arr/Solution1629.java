package arr;

import java.util.HashMap;
import java.util.Map;

public class Solution1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] arr = keysPressed.toCharArray();
        int[] map = new int[26];
        map[arr[0] - 'a'] += releaseTimes[0];
        int max = Math.max(0, map[arr[0] - 'a']);
        for (int i = 1; i < arr.length; i++) {
            map[arr[i] - 'a'] = Math.max(releaseTimes[i] - releaseTimes[i - 1], map[arr[i] - 'a']);
            max = Math.max(max, map[arr[i] - 'a']);
        }
        for (int i = 25; i >= 0; i--) {
            if (map[i] == max) {
                return (char) ('a' + i);
            }
        }
        return ' ';
    }
}
