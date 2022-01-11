package arr;

public class Solution243Again {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int idx = -1;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1) || wordsDict[i].equals(word2)) {
                if (idx != -1 && !wordsDict[i].equals(wordsDict[idx])) {
                    res = Math.min(res, Math.abs(i - idx));
                }
                idx = i;
            }
        }
        return res;
    }
}
