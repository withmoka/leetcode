package str;

public class Solution434 {
    public static int countSegments(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                res += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "    foo    bar";
        int res = countSegments(s);
        System.out.println(res);
    }
}
