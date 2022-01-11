package arr;

public class Solution243 {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int res = Integer.MAX_VALUE;
        int left = -1;
        int right = -1;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                left = i;
            }
            if (wordsDict[i].equals(word2)) {
                right = i;
            }
            if (left != -1 && right != -1) {
                res = Math.min(res, Math.abs(left - right));
            }
        }
        return res;
    }
}
