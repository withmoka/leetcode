package arr;


public class Solution791 {
    public String customSortString(String order, String s) {
        char[] inOrder = order.toCharArray();
        char[] arr = s.toCharArray();
        int[] map = new int[26];
        for (char ch : arr) {
            map[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : inOrder) {
            int count = map[ch - 'a'];
            if (count > 0) {
                for (int i = 0; i < count; i++) {
                    sb.append(ch);
                }
                map[ch - 'a'] = 0;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (map[i] > 0) {
                for (int j = 0; j < map[i]; j++) {
                    sb.append((char) (i + 'a'));
                }
            }
        }
        return sb.toString();
    }
}
