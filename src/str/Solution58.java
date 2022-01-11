package str;

public class Solution58 {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split("\\s+");
        if (arr.length < 1) {
            return 0;
        }
        int index = arr.length - 1;
        return arr[index].length();
    }
}
