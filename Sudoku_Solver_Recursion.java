import java.util.*;

//SUDOKU SOLVER PROBLEM USING RECURSION  *** VVIP QUESTION (QUESTION LINK - https://practice.geeksforgeeks.org/problems/solve-the-sudoku-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=solve-the-sudoku)

//TIME COMPLEXCITY - O(9(n ^ 2)), in the worst case, for each cell in the n2 board, we have 9 possible numbers.

//SPACE COMPLEXCITY - O(1), since we are refilling the given board itself, there is no extra space required, so constant space complexity.



public class Sudoku_Solver_Recursion{

    public static boolean solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
          for (int j = 0; j < 9; j++) {
            if (board[i][j] == '.') {
    
              for (char c = '1'; c <= '9'; c++) {
                if (isValid(board, i, j, c)) {
                  board[i][j] = c;
    
                  if (solveSudoku(board))
                    return true;
                  else
                    board[i][j] = '.';
                }
              }
    
              return false;
            }
          }
        }
        return true;
      }
    
      public static boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
          if (board[i][col] == c)
            return false;
    
          if (board[row][i] == c)
            return false;
    
          if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
            return false;
        }
        return true;
      }


    public static void main(String[] args) {
        char[][] board= {
            {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
            {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
            {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
            {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
            {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
            {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
            {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
            {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
            {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
            };

            solveSudoku(board);

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++){
                   System.out.print(board[i][j] + " ");
                   
                }
                System.out.println();
                 
            }
    }
}