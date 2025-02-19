package main.java.medium;

/**
 * {@link https://leetcode.com/problems/valid-sudoku/description}
 */

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char cell = board[row][col];

                if (cell == '.' || cell < '1' || cell > '9') {
                    continue;
                }

                int num = cell - '1';
                int boxIndex = (row / 3) * 3 + col / 3;

                if (rows[row][num] || cols[col][num] || boxes[boxIndex][num]) {
                    return false;
                }

                rows[row][num] = cols[col][num] = boxes[boxIndex][num] = true;
            }
        }
        return true;
    }

}
