package dfs;

import java.util.ArrayList;
import java.util.List;

public class Solution743 {
//
//    public static int networkDelayTime(int[][] times, int n, int k) {
//        boolean[] visited = new boolean[n];
////        int res = dfs(times, k, visited, 0);
//        for (int i = 0; i < n; i++) {
//            if (!visited[i]) {
////                System.out.println(i);
//                return -1;
//            }
//        }
//        return -1;
////        return res;
//    }
//
//    public static int dfs(int[][] times, int k, boolean[] visited) {
//        int total = 0;
//        List<Integer> temp = new ArrayList<>();
//        for (int[] time : times) {
//            if (time[0] == k) {
//                int next = time[1];
//                int weight = time[2];
//                total += weight;
//                visited[k - 1] = true;
//                visited[next - 1] = true;
////                System.out.println(k - 1);
////                System.out.println(next - 1);
//                temp.add(next);
//            }
//        }
//        System.out.println(temp);
//        for (int next : temp) {
//            total += dfs(times, next, visited, res);
//            if (total > res) {
//                res = total;
//            }
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int[][] times = {{1, 2, 1}};
//        int n = 2;
//        int k = 1;
//        int res = networkDelayTime(times, n, k);
////        System.out.println(res);
//    }
}
