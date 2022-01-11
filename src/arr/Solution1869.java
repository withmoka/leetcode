package arr;

public class Solution1869 {
    public boolean checkZeroOnes(String s) {
        s = s + "2";
        char[] arr = s.toCharArray();
        int len0 = 0;
        int len1 = 0;
        int temp0 = 0;
        int temp1 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '0' && arr[i + 1] == '0') {
                temp0++;
            } else if (arr[i] == '1' && arr[i + 1] == '1') {
                temp1++;
            } else if (arr[i] == '0' && arr[i + 1] == '1') {
                temp0++;
                len0 = Math.max(temp0, len0);
                temp0 = 0;
            } else if (arr[i] == '1' && arr[i + 1] == '0') {
                temp1++;
                len1 = Math.max(temp1, len1);
                temp1 = 0;
            } else if (arr[i] == '0' && arr[i + 1] == '2') {
                temp0++;
                len0 = Math.max(len0, temp0);
            } else if (arr[i] == '1' && arr[i + 1] == '2') {
                temp1++;
                len1 = Math.max(len1, temp1);
            }
        }
        return len1 > len0;
    }
}
