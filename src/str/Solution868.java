package str;

public class Solution868 {
    public static int binaryGap(int n) {
        String str = Integer.toBinaryString(n);
        char[] arr = str.toCharArray();
        int left = -1;
        int right = -1;
        int temp = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                left = i;
                break;
            }
        }
        for (int i = left + 1; i < arr.length; i++) {
            if (arr[i] == '1') {
                right = i;
                temp = right - left;
                res = Math.max(res, temp);
                left = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        int res = binaryGap(n);
        System.out.println(res);
    }
}
