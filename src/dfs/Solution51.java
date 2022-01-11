package dfs;

import java.util.ArrayList;
import java.util.List;

public class Solution51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        dfs(res, board, 0);
        return res;
    }

    public void dfs(List<List<String>> res, char[][] board, int colIndex) {
        if (colIndex == board.length) {
            res.add(construct(board));
        } else {
            for (int i = 0; i < board.length; i++) {
                if (isValid(board, i, colIndex)) {
                    board[i][colIndex] = 'Q';
                    dfs(res, board, colIndex + 1);
                    board[i][colIndex] = '.';
                }
            }
        }
    }


    // 在x行y列的queen，和棋盘上的其他queen是否会冲突
    public boolean isValid(char[][] board, int x, int y) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < y; j++) {
                if (board[i][j] == 'Q' && (i == x || (x + y) == (i + j) || (x + j) == (y + i))) {
                    return false;
                }
            }
        }
        return true;
    }

    // 可以直接把 char[] 转换为  String
    public List<String> construct(char[][] board) {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            temp.add(new String(board[i]));
        }
        return temp;
    }
}
