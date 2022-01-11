package graph;

public class Solution1061 {
    public String smallestEquivalentString(String A, String B, String S) {
        DSU dsu = new DSU(26);
        int len = A.length();
        char[] chA = A.toCharArray();
        char[] chB = B.toCharArray();
        for (int i = 0; i < len; i++) {
            int n1 = chA[i] - 'a';
            int n2 = chB[i] - 'b';
            if (n1 < n2) {
                dsu.union(n2, n1);
            } else {
                dsu.union(n1, n2);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : S.toCharArray()) {
            int root = dsu.find(ch - 'a');
            stringBuilder.append((char) (root + 'a'));
        }
        return stringBuilder.toString();
    }
}
