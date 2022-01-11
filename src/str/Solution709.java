package str;

public class Solution709 {
    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : arr) {
            if ((ch - 65) >= 0 && (ch - 65) < 26) {
                ch = (char) (ch + 32);
                sb.append(ch);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
