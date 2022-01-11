package str;

public class Solution1844 {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sb.append(arr[i]);
            } else {
                int num = (int) arr[i] - (int) ('0');
                char ch = (char) ((int) (arr[i - 1]) + num);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
