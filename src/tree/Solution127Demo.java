package tree;

import java.util.*;

public class Solution127Demo {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);//把一个List自动转变成了一个Set，表格变成了集合？？？
        Queue<String> q = new LinkedList<>();//创建一个队列，用来存放字符串（单词
        q.offer(beginWord);//第一个单词先入队
        int step = 1;//??????做步数的统计？？？？
        int N = beginWord.length();//?????单词长度
        while (!q.isEmpty()) {//当q不为空的时候
            int size = q.size();//我们拿到当前层所有的node，遍历当前层所有的node
            for (int i = 0; i < size; i++) {//去遍历当前层
                String cur = q.poll();//cur就是拿到当前的单词
                if (cur.equals(endWord)) {//先判断当前单词是否为终点
                    return step;//如果已经是终点了，那么就return走了多少步
                }
                //如果它不是终点，我们就把当前单词拆开
                for (int j = 0; j < N; j++) {//单词位数
                    for (char letter = 'a'; letter <= 'z'; letter++) {
                        StringBuilder next = new StringBuilder(cur);//这个StringBuilder就很方便
                        next.setCharAt(j, letter);//可以把当前单词的任意一个j位置的单词，替换为letter
                        String nextWord = next.toString();//产生出的新的word就记为nextWord
                        if (set.contains(nextWord)) {//看看nextWord在不在字典里，因为只有在字典里的我们才能继续往下变
                            //否则没路可走
                            if (nextWord.equals(endWord)) {
                                return step + 1;//在字典里的话，加一步
                            }
                            set.remove(nextWord);//把这个单词从字典里拿出来，每个单词只能用一次，用完就拿走，否则就会循环
                            q.offer(nextWord);//然后把这个单词放进q
                        }
                    }
                }
            }
            step++;
        }
        return 0;
    }
}
