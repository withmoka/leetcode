package prefix;

public class Solution1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr = new int[n + 1];
        for (int[] booking : bookings) {
            int start = booking[0];
            int end = booking[1];
            int seat = booking[2];
            arr[start] += seat;
            if (end + 1 < n + 1) {
                arr[end + 1] -= seat;
            }
        }
        // [[1,2,10],[2,3,20],[2,5,25]] , n = 5
        // [0,10,0,-10,0,0]
        // [0,10,20,-10,-20,0]
        // arr: [0,10,45,-10,-20,0]
        // pre: [0,10,55,45,25,25]
        int[] pre = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            pre[i] = pre[i - 1] + arr[i];
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = pre[i + 1];
        }
        return ans;
    }
}
