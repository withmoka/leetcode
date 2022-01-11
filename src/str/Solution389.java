package str;

public class Solution389 {
    public char findTheDifference(String s, String t) {
        char[] arr1 = s.toCharArray();
        int[] map = new int[26];
        for (char ch : arr1) {
            map[ch - 'a']++;
        }
        char[] arr2 = t.toCharArray();
        for (char ch : arr2) {
            map[ch - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (map[i] != 0) {
                return (char) (i + 'a');
            }
        }
        return 'a';
    }
}
