package arr;

public class Solution0102 {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        for (char ch : ch1) {
            arr1[ch - 'a']++;
        }
        for (char ch : ch2) {
            arr2[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
