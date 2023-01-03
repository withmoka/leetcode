package arr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<Integer, List<String>> map = new HashMap<>();
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int temp = i + j;
                    if (temp <= sum) {
                        sum = temp;
                        if (!map.containsKey(sum)) {
                            List<String> l = new ArrayList<>();
                            l.add(list1[i]);
                            map.put(sum, l);
                        } else {
                            List<String> l = map.get(temp);
                            l.add(list1[i]);
                            map.put(sum, l);
                        }
                    }
                }
            }
        }
        List<String> list = map.get(sum);
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
