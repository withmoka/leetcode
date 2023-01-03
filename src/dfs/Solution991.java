package dfs;

public class Solution991 {
    public static int brokenCalc(int startValue, int target) {
        if (startValue >= target) {
            return startValue - target;
        }
        if (target % 2 == 0) {
            return brokenCalc(startValue, target / 2) + 1;
        } else {
            return brokenCalc(startValue, target + 1) + 1;
        }
    }

    public static void main(String[] args) {
        int res = brokenCalc(2, 3);
        System.out.println(res);
    }
}
