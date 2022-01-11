package str;

public class Solution1021 {
    public String removeOuterParentheses(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : arr) {
            if (ch == '(') {
                if (count > 0) {
                    sb.append(ch);
                }
                count++;
            } else {
                if (count > 1) {
                    sb.append(ch);
                }
                count--;
            }
        }
        return sb.toString();
    }
}
