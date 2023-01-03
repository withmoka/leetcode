package week;

import java.util.*;

public class Solution5203 {
    public static List<int[]> helper(int[] artifact) {
        // 给一个工件，返回一个list，里面装着所有点坐标 ok
        List<int[]> list = new ArrayList<>();
        int r1 = artifact[0];
        int c1 = artifact[1];
        int r2 = artifact[2];
        int c2 = artifact[3];
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                list.add(new int[]{i, j});
            }
        }
        return list;
    }

    public static boolean exist(int[][] two, int[] one) {
        for (int[] ele : two) {
            if (ele[0] == one[0] && ele[1] == one[1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean getAll(int[][] dig, List<int[]> list) {
        boolean flag = true;
        for (int[] ele : list) {
            if (!exist(dig, ele)) {
                return false;
            }
        }
        return flag;
    }

    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        int count = 0;
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int[] artifact = artifacts[i];
            List<int[]> list = helper(artifact);
            map.put(i, list);
        }
        for (List<int[]> list : map.values()) {
            if (getAll(dig, list)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[][] = {{0, 0, 0, 0}, {0, 1, 1, 1}};
        int d[][] = {{0, 0}, {0, 1}};
        digArtifacts(2, a, d);
    }
}
