package arr;

public class Solution693 {
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        if (s.length() == 1) {
            return true;
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i + 1 < s.length(); i++) {
            if (arr[i + 1] == arr[i]) {
                return false;
            }
        }
        return true;
    }
}
