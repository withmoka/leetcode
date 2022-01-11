package str;

public class Solution557 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split("\\s+");
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            char[] chars = arr[i].toCharArray();
            char temp = 'a';
            for (int j = 0; j < chars.length / 2; j++) {
                temp = chars[j];
                chars[j] = chars[chars.length - 1 - j];
                chars[chars.length - 1 - j] = temp;
            }
            sb.append(chars);
            sb.append(" ");
        }
        char[] last = arr[len - 1].toCharArray();
        char temp = 'a';
        for (int j = 0; j < last.length / 2; j++) {
            temp = last[j];
            last[j] = last[last.length - 1 - j];
            last[last.length - 1 - j] = temp;
        }
        sb.append(last);
        return sb.toString();
    }
}
