package DSA;

class Solution {
    public boolean isSafe(char[][] board, int row, int column, int number) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }
        int sr = (row / 3) * 3;
        int sc = (column / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int column) {
        if (row == board.length) {
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if (column != board.length - 1) {
            nrow = row;
            ncol = column + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }
        if (board[row][column] != '.') {
            if (helper(board, nrow, ncol)) {
                return true;
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, column, i)) {
                    board[row][column] = (char) (i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][column] = '.';
                    }
                }
            }
        }
        return false;
    }
}

public class BackTracking {
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Solution solver = new Solution();
        if (solver.helper(board, 0, 0)) {
            for (char[] row : board) {
                for (char cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists");
        }
    }
}
