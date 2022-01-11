package str;

public class SolutionOffer58 {
    public String reverseLeftWords(String s, int n) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
