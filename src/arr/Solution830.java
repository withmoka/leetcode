package arr;

import java.util.ArrayList;
import java.util.List;

public class Solution830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        char[] arr = s.toCharArray();
        int len = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                if (len >= 3) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i - len + 1);
                    list.add(i);
                    res.add(list);
                }
                len = 1;
            } else {
                len++;
            }
        }
        return res;
    }
}
