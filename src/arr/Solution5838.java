package arr;

public class Solution5838 {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
            if (sb.toString().length() == s.length()) {
                if (sb.toString().equals(s)) {
                    return true;
                }
            } else if (sb.toString().length() > s.length()) {
                return false;
            }
        }
        return false;
    }
}
