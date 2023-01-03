package prefix;

public class Solution1109Again {
    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] temp = new int[n + 1];
        for (int[] booking : bookings) {
            int first = booking[0];
            int last = booking[1];
            int seats = booking[2];
            temp[first] += seats;
            if (last + 1 < temp.length) {
                temp[last + 1] -= seats;
            }
        }
//        for(int ele:temp){
//            System.out.println(ele);
//        }
        int[] res = new int[n];
        res[0] = temp[1];
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] + temp[i + 1];
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] bookings = new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int[] res = corpFlightBookings(bookings, 5);
        for(int ele:res){
            System.out.println(ele);
        }
        // [0,10,45,-10,-20,0]
        // [10,55,45,25,25]
    }
}
