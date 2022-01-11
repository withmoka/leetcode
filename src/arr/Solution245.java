package arr;

public class Solution245 {
    public int shortestWordDistance(String[] wordsDict, String word1, String word2) {
        int idx = -1;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1) || wordsDict[i].equals(word2)) {
                // 确保idx已经记录了至少有一个word1或者word2
                // 1、默认两个单词不一样的情况：如果当前遇到的单词和idx记录的不一样，说明是1遇到了最近记录的2或者2遇到了最近记录的1
                // 2、两个单词一样的情况：可以记录
                if (idx != -1 && (!wordsDict[i].equals(wordsDict[idx]) || word1.equals(word2))) {
                    res = Math.min(res, Math.abs(i - idx));
                }
                // 会记下最新的一个match了word1或者word2的单词的位置
                idx = i;
            }
        }
        return res;
    }
}
