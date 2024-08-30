package Chess_Board;

import java.util.Arrays;

public class ChessBoard {
    public static void printBoard(char [][] board){
        boolean isWhite = false;

        for (int i = 0; i < board.length; i++) {
            isWhite = !isWhite;
            for (int j = 0; j < board[i].length ; j++) {
                if(isWhite) {
                    board[i][j] = 'W';
                } else {
                    board[i][j] = 'B';
                }
                isWhite = !isWhite;
            }
        }

        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }

    public static void main(String[] args) {
        int boardDimension = 8;
        char[][] board = new char[boardDimension][boardDimension];
        System.out.println();

        printBoard(board);
    }
}
