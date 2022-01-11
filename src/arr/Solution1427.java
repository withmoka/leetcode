package arr;

public class Solution1427 {
    public String stringShift(String s, int[][] shift) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int dir = 0;
        for (int[] change : shift) {
            if (change[0] == 0) {
                dir -= change[1];
            } else {
                dir += change[1];
            }
        }
        if (dir == 0) {
            return s;
        } else if (dir > 0) {
            while (dir > arr.length) {
                dir = dir % arr.length;
            }
            for (int i = arr.length - dir; i < arr.length; i++) {
                sb.append(arr[i]);
            }
            for (int i = 0; i < arr.length - dir; i++) {
                sb.append(arr[i]);
            }
        } else {
            dir = Math.abs(dir);
            while (dir > arr.length) {
                dir = dir % arr.length;
            }
            for (int i = dir; i < arr.length; i++) {
                sb.append(arr[i]);
            }
            for (int i = 0; i < dir; i++) {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}
