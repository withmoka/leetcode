package dfs;

import java.util.ArrayList;
import java.util.List;

public class Solution93 {
    List<String> ans = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        int[] segments = new int[4];
        dfs(s, segments, 0, 0);
        return ans;
    }

    public void dfs(String s, int[] segments, int segID, int start) {
        if (segID == 4) {
            if (start != s.length()) {
                return;
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 4; i++) {
                sb.append(segments[i]);
                if (i != 3) {
                    sb.append('.');
                }
            }
            String res = sb.toString();
            ans.add(res);
            return;

        }
        if (start == s.length()) {
            return;
        }
        if (s.charAt(start) == '0') {
            segments[segID] = 0;
            dfs(s, segments, segID + 1, start + 1);
        }

        int add = 0;
        for (
                int segEnd = start; segEnd < s.length(); segEnd++) {
            add = Integer.parseInt(String.valueOf(add) + String.valueOf(s.charAt(segEnd)));
            if (add <= 0 || add > 255) {
                break;
            }
            segments[segID] = add;
            dfs(s, segments, segID + 1, segEnd + 1);
        }
    }
}
