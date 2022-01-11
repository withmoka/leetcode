package str;

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int index = 0;
        boolean flag = true;
        while (flag) {
            if (index == strs[0].length()) {
                break;
            }
            for (int i = 1; i < strs.length; i++) {
                String cur = strs[i];
                if (index == cur.length()) {
                    flag = false;
                    break;
                }
                if (cur.charAt(index) != strs[0].charAt(index)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sb.append(strs[0].charAt(index));
                index++;
            }
        }
        return sb.toString();
    }
}
