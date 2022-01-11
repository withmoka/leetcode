package arr;

public class Solution1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) {
            return true;
        }
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];
        if (x1 == x2) {
            for (int[] coordinate : coordinates) {
                if (coordinate[0] != x1) {
                    return false;
                }
            }
            return true;
        }
        for (int[] coordinate : coordinates) {
            int x = coordinate[0];
            int y = coordinate[1];
            if ((y - y1) * (x1 - x2) != (x - x1) * (y1 - y2)) {
                return false;
            }
        }
        return true;
    }
}
