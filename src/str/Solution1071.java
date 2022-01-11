package str;

public class Solution1071 {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        return str1.substring(0, helper(str1.length(), str2.length()));
    }

    public int helper(int a, int b) {
        if (b == 0) {
            return a;
        }
        return helper(b, a % b);
    }
}
