package prefix;

public class Solution1371 {
    public static boolean helper(char a) {
        char[] target = new char[]{'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < 5; i++) {
            if (a == target[i]) {
                return true;
            }
        }
        return false;
    }

    public static int findTheLongestSubstring(String s) {
        int len = s.length();
        char[] chArr = s.toCharArray();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            if (helper(chArr[i])) {
                arr[i] = 1;
            }
        }
        int[] pre = new int[len];
        // [0,x] 的元音次数
        pre[0] = arr[0];
        for (int i = 1; i < pre.length; i++) {
            pre[i] = pre[i - 1] + arr[i];
        }
        int maxLen = 0;
        for (int i = 0; i < pre.length; i++) {
            if (pre[i] % 2 == 0) {
                maxLen = Math.max(0, i + 1);
            }
        }
        for (int i = 1; i < pre.length; i++) {
            for (int j = i; j < pre.length; j++) {
                if ((pre[j] - pre[i - 1]) % 2 == 0) {
                    maxLen = Math.max(maxLen, (j - i + 1));
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "eleetminicoworoep";
        int res = findTheLongestSubstring(s);
        System.out.println(res);
    }
}
