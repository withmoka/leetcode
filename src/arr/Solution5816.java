package arr;

public class Solution5816 {
    public int[] maxGeneticDifference(int[] parents, int[][] queries) {
        int pBit = (int) Math.log(parents.length + 1);
        int len = queries.length;
        int[] ans = new int[len];
        int k = 0;
        for (int[] query : queries) {
            int temp = query[0];
            int value = query[1];
            value = value / ((int) Math.pow(2, pBit));
            int res = temp ^ value;
            while (parents[temp] != -1) {
                temp = parents[temp];
                int cur = temp ^ value;
                if (cur > res) {
                    res = cur;
                }
            }
            ans[k] = res;
            k++;
            if (k == len) {
                break;
            }
        }
        return ans;
    }
}
