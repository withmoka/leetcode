package arr;

public class Solution999 {
    public int numRookCaptures(char[][] board) {
        int count = 0;
        int x = 0, y = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                }
            }
        }
        for (int i = (x - 1); i >= 0; i--) {
            if (board[i][y] == 'p') {
                count++;
                break;
            } else if (board[i][y] == 'B') {
                break;
            }
        }
        for (int i = (x + 1); i < 8; i++) {
            if (board[i][y] == 'p') {
                count++;
                break;
            } else if (board[i][y] == 'B') {
                break;
            }
        }
        for (int i = (y - 1); i >= 0; i--) {
            if (board[x][i] == 'p') {
                count++;
                break;
            } else if (board[x][i] == 'B') {
                break;
            }
        }
        for (int i = (y + 1); i < 8; i++) {
            if (board[x][i] == 'p') {
                count++;
                break;
            } else if (board[x][i] == 'B') {
                break;
            }
        }
        return count;
    }
}
