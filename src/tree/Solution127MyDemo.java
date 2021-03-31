package tree;

import java.util.*;

public class Solution127MyDemo {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int Step = 1;
        int N = beginWord.length();
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String cur = q.poll();
                if (cur.equals(endWord)) {
                    return Step;
                }
                for (int j = 0; j < N; j++) {
                    for (char letter = 'a'; letter <= 'z'; letter++) {
                        StringBuilder next = new StringBuilder(cur);
                        next.setCharAt(j, letter);
                        String nextWord = next.toString();
                        if (set.contains(nextWord)) {
                            if (nextWord.equals(endWord)) {
                                return Step + 1;
                            }
                            set.remove(nextWord);
                            q.offer(nextWord);
                        }
                    }
                }
            }
            Step++;
        }
        return 0;
    }
}
