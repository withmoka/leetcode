package str;

public class Solution1812 {
    public boolean squareIsWhite(String coordinates) {
        char[] arr = coordinates.toCharArray();
        int row = 8 - ((int) arr[1] - (int) ('0'));
        int col = arr[0] - 'a';
        if ((row % 2 == 0 && col % 2 == 0) || (row % 2 == 1 && col % 2 == 1)) {
            return true;
        }
        return false;
    }
}
