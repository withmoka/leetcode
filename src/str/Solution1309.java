package str;

public class Solution1309 {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int len = arr.length;
        int index = 0;
        while (index != len) {
            int next = index + 2;
            if (next < len && arr[next] == '#') {
                int a = (int) (arr[index] - '0');
                int b = (int) (arr[index + 1] - '0');
                sb.append((char) (a * 10 + b + 96));
                index = index + 3;
            } else {
                sb.append((char) ((int) arr[index] - '0' + 96));
                index++;
            }
        }
        return sb.toString();
    }
}
