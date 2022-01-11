package arr;

public class Solution1816 {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split("\\s+");
        if (k == 1) {
            return arr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k - 1; i++) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        sb.append(arr[k - 1]);
        return sb.toString();
    }
}
