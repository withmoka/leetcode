package arr;

public class Solution5161 {
    public int canBeTypedWords(String text, String brokenLetters) {
        char[] broken = brokenLetters.toCharArray();
        int[] bro = new int[26];
        for (char ch : broken) {
            bro[ch - 'a']++;
        }
        int countError = 0;
        String[] arr = text.split("\\s+");
        for (String str : arr) {
            char[] strArr = str.toCharArray();
            for (char ch : strArr) {
                if (bro[ch - 'a'] == 1) {
                    countError++;
                    break;
                }
            }
        }
        return arr.length - countError;
    }
}
