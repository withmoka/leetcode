package str;

public class Solution942 {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] res = new int[n + 1];
        int left = 0;
        int right = n;
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'I') {
                res[i] = left;
                left++;
            } else {
                res[i] = right;
                right--;
            }
        }
        res[n] = left;
        return res;
    }
}
