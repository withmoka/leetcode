package str;

public class Solution1704 {
    public boolean halvesAreAlike(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int count1 = 0, count2 = 0;
        for (int i = 0; i < len / 2; i++) {
            if (helper(arr[i])) {
                count1++;
            }
        }
        for (int i = len / 2; i < len; i++) {
            if (helper(arr[i])) {
                count2++;
            }
        }
        return count1 == count2;
    }

    public boolean helper(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
