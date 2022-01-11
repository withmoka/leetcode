package greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution781 {
    public int numRabbits(int[] answers) {
        if (answers == null) {
            return 0;
        }
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int ans : answers) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }
        for (int answer : map.keySet()) {
            int rabbit = map.get(answer);
            int numColor;
            if (rabbit % (answer + 1) == 0) {
                numColor = rabbit / (answer + 1);
            } else {
                numColor = rabbit / (answer + 1) + 1;
            }
            sum = sum + numColor * (answer + 1);
        }
        return sum;
    }
}
