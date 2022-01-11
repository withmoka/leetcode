package str;

public class Solution1119 {
    public String removeVowels(String s) {
        s = s.replace("a", "");
        s = s.replace("e", "");
        s = s.replace("i", "");
        s = s.replace("o", "");
        s = s.replace("u", "");
        return s;
    }
}
