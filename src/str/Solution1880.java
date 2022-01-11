package str;

public class Solution1880 {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        char[] arrFirst = firstWord.toCharArray();
        char[] arrSecond = secondWord.toCharArray();
        int num1 = 0;
        int num2 = 0;
        for (char ch : arrFirst) {
            num1 = num1 * 10 + ch - 'a';
        }
        for (char ch : arrSecond) {
            num2 = num2 * 10 + ch - 'a';
        }
        char[] arr = targetWord.toCharArray();
        int target = 0;
        for (char ch : arr) {
            target = target * 10 + ch - 'a';
        }
        return (num1 + num2) == target;
    }
}
