package str;

public class Solution1816 {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split("\\s+");
        if (k >= arr.length) {
            return s;
        }
        for (int i = 0; i < k - 1; i++) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        sb.append(arr[k - 1]);
        return sb.toString();
    }
}
