package graph;

import java.util.HashMap;
import java.util.Map;

public class Solution128Demo {
    public int longestConsecutive(int[] nums) {
        DSU1 dsu1 = new DSU1(nums.length);//先new出来
        Map<Integer,Integer> map = new HashMap<>();//map的key用来放，这个数是什么；value用来放，它分到了哪个集合中，集合的编号吧！
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                continue;//如果这个数已经有了，那就跳过，因为它不会影响我们要找的最长连续序列
            }
            map.put(nums[i],i);//否则就加进去
            if(map.containsKey(nums[i]+1)){//假设数是100，map里有101
                dsu1.union(i,map.get(nums[i]+1));//那么就把这两个集合融合一下
            }
            if(map.containsKey(nums[i]-1)){
                dsu1.union(i,map.get(nums[i]-1));
            }
        }
        return dsu1.findMax();//已经分好堆了，挑出数量最多的那个堆
    }
}
