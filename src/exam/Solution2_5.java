package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2_5 {
    public static void arrange(int n, String str) {
        char[] arr = str.toCharArray();
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean[] v = new boolean[n];
        Arrays.sort(arr);
        dfs(res, sb, v, arr);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
        System.out.println(res.size());
    }

    public static void dfs(List<String> res, StringBuilder sb, boolean[] v, char[] arr) {
        if (sb.length() == arr.length) {
            res.add(sb.toString());
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (v[i] || (i > 0 && arr[i] == arr[i - 1] && !v[i - 1])) {
                continue;
            }
            sb.append(arr[i]);
            v[i] = true;
            dfs(res, sb, v, arr);
            sb.deleteCharAt(sb.length() - 1);
            v[i] = false;
        }
    }

    public static void main(String[] args) {
        arrange(4, "ccaa");
    }
}
