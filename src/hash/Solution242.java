package hash;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        int[] temp = new int[26];
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for (char ch : arr1) {
            temp[ch - 'a']++;
        }
        for (char ch : arr2) {
            temp[ch - 'a']--;
        }
        for (int i : temp) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
