package arr;

public class Solution796 {
    public boolean rotateString(String s, String goal) {
        String ss = s + s;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = i + len; j < len * 2; j++) {
                String sub = ss.substring(i, i + len);
                if (sub.equals(goal)) {
                    return true;
                }
            }
        }
        return false;
    }
}
