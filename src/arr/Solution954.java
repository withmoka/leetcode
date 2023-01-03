package arr;

import java.util.ArrayList;
import java.util.List;

public class Solution954 {
    public static boolean canReorderDoubled(int[] arr) {
        int len = arr.length;
        if (len == 2) {
            if (arr[1] == 2 * arr[0] || arr[0] == 2 * arr[1]) {
                return true;
            } else {
                return false;
            }
        }
        List<Integer> list = new ArrayList<>();
        int count_0 = 0;
        for (int ele : arr) {
            if (ele == 0) {
                count_0++;
                continue;
            }
            list.add(ele);
        }
        boolean flag = true;
        while (flag) {
            int i = 0;
            flag = false;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == 2 * list.get(j) || list.get(j) == 2 * list.get(i)) {
                    list.remove(i);
                    list.remove(j - 1);
                    flag = true;
                    break;
                }
            }
        }
        if (list.size() == 0 || list.size() == count_0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 0, 0, 8, 1};
        boolean res = canReorderDoubled(arr);
        System.out.println(res);
    }
}
