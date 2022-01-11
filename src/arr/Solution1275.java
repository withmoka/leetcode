package arr;

public class Solution1275 {
    public String tictactoe(int[][] moves) {
        int[][] graph = new int[3][3];
        for (int i = 0; i < moves.length; i++) {
            int x = moves[i][0];
            int y = moves[i][1];
            if (i % 2 == 0) {
                graph[x][y] = 1;
            } else {
                graph[x][y] = 2;
            }
        }
        for (int i = 0; i < 3; i++) {
            int rowA = 0, rowB = 0;
            for (int j = 0; j < 3; j++) {
                if (graph[i][j] == 1) {
                    rowA++;
                } else if (graph[i][j] == 2) {
                    rowB++;
                }
            }
            if (rowA == 3) {
                return "A";
            }
            if (rowB == 3) {
                return "B";
            }
        }
        for (int i = 0; i < 3; i++) {
            int colA = 0, colB = 0;
            for (int j = 0; j < 3; j++) {
                if (graph[j][i] == 1) {
                    colA++;
                } else if (graph[j][i] == 2) {
                    colB++;
                }
            }
            if (colA == 3) {
                return "A";
            }
            if (colB == 3) {
                return "B";
            }
        }
        if (graph[0][0] == 1 && graph[1][1] == 1 && graph[2][2] == 1) {
            return "A";
        }
        if (graph[0][0] == 2 && graph[1][1] == 2 && graph[2][2] == 2) {
            return "B";
        }
        if (graph[0][2] == 1 && graph[1][1] == 1 && graph[2][0] == 1) {
            return "A";
        }
        if (graph[0][2] == 2 && graph[1][1] == 2 && graph[2][0] == 2) {
            return "B";
        }
        if (moves.length == 9) {
            return "Draw";
        }
        return "Pending";
    }
}
