package arr;

public class Solution1160 {
    public int countCharacters(String[] words, String chars) {
        char[] arr = chars.toCharArray();
        int[] num = new int[26];
        for (char ch : arr) {
            num[ch - 'a']++;
        }
        int sum = 0;
        for (String s : words) {
            char[] str = s.toCharArray();
            int[] count = new int[26];
            for (char ch : str) {
                count[ch - 'a']++;
            }
            boolean flag = true;
            for (int i = 0; i < 26; i++) {
                if (num[i] < count[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sum += s.length();
            }
        }
        return sum;
    }
}
