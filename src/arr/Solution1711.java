package arr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1711 {
    public int findClosest(String[] words, String word1, String word2) {
        List<Integer> map1 = new ArrayList<>();
        List<Integer> map2 = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                map1.add(i);
            } else if (words[i].equals(word2)) {
                map2.add(i);
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < map1.size(); i++) {
            int tempRes = Integer.MAX_VALUE;
            for (int j = 0; j < map2.size(); j++) {
                int temp = Math.abs(map1.get(i) - map2.get(j));
                if (temp > tempRes) {
                    break;
                }
                tempRes = Math.min(tempRes, temp);
            }
            res = Math.min(res, tempRes);
        }
        return res;
    }
}
