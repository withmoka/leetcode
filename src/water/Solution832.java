package water;

public class Solution832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int len = row.length;
            int temp = 0;
            for (int i = 0; i < len / 2; i++) {
                temp = row[i];
                row[i] = row[len - 1 - i];
                row[len - 1 - i] = temp;
            }
            for (int i = 0; i < len; i++) {
                row[i] = (row[i] + 1) % 2;
            }
        }
        return image;
    }
}
