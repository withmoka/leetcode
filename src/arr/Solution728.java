package arr;

import java.util.ArrayList;
import java.util.List;

public class Solution728 {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (helper(i)) {
                res.add(i);
            }
        }
        return res;
    }

    public static boolean helper(int num) {
        int tmp = num;
        while (num != 0) {
            int ele = num % 10;
            if (ele == 0) {
                return false;
            }
            if (tmp % ele != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 21;
        int right = 21;
        List<Integer> res = selfDividingNumbers(left, right);
        for (int ele : res) {
            System.out.println(ele);
        }
    }
}
