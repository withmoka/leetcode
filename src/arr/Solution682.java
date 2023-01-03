package arr;

import java.util.ArrayList;
import java.util.List;

public class Solution682 {
    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < ops.length; i++) {
            String s = ops[i];
            if (s.equals("+")) {
                list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
            } else if (s.equals("C")) {
                list.remove(list.size() - 1);
            } else if (s.equals("D")) {
                list.add(list.get(list.size() - 1) * 2);
            } else {
                int val = Integer.parseInt(s);
                list.add(val);
            }
        }
        int res = 0;
        for (int ele : list) {
            res += ele;
        }
        return res;
    }
}
