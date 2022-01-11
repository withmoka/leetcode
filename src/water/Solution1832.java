package water;

public class Solution1832 {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        int[] index = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            index[sentence.charAt(i) - 97] = 1;
        }
        for (int i : index) {
            if (i != 1) {
                return false;
            }
        }
        return true;
    }
}
