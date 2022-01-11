package str;

public class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int len1 = arr1.length;
        int len2 = arr2.length;
        int min = Math.min(len1, len2);
        for (int i = 0; i < min; i++) {
            sb.append(arr1[i]);
            sb.append(arr2[i]);
        }
        if (len1 > min) {
            for (int i = min; i < len1; i++) {
                sb.append(arr1[i]);
            }
        }
        if (len2 > min) {
            for (int i = min; i < len2; i++) {
                sb.append(arr2[i]);
            }
        }
        return sb.toString();
    }
}
