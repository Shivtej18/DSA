package Backtracking;

public class N_Queen {

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int count = 0; // count number of ways to print.


    public static void nQueens(char board[][], int row) {
        // base
        if (row == board.length) {
            printBoard(board);
            count++;
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);    //recursively changes rows
                board[row][j] = 'x';
            }
        }
    }

    // exist or not and return 1 solution.
    public static boolean nQueensExistsOrNot(char board[][], int row) {
        // base
        if (row == board.length) {
            return true;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueensExistsOrNot(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'X';

            }
        }
        return false;
    }

    //safe condition.
    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];
        // initialise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        // count qns :->
        // nQueens(board, 0);
        // System.out.println(count + " Ways to arrange queens.");

        // Solution is possible or not and return 1 solution :->
        if (nQueensExistsOrNot(board, 0)) {
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("Soution is not possible");
        }

    }

}