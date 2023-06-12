import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            //Task 1: Create an array with three rows of '_' characters.
            char[][] board = {{'_', '_', '_'}, 
                              {'_', '_', '_'}, 
                              {'_', '_', '_'}};

            //Task 2: Call the function printBoard();
            printBoard(board);
            
            for (int i = 0; i < 9; i++) {
              if (i % 2 == 0) {
                System.out.println("Turn: X");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
              } else {
                System.out.println("Turn: O");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
              }
              printBoard(board);
            }
              /*
                Task 6 - Call the function.
                   if return value == 3 {
                     print: X wins and break the loop
                  } else if return value == -3 {
                     print: O wins and break the loop
                  }

              } 
              */

            scan.close();
        }
    
        //Task 2 - Write a function that prints the board.
        public static void printBoard(char[][] board) {
          System.out.print("\n");
          for (int i = 0; i < board.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
              System.out.print(board[i][j] + " ");
            }
            System.out.print("\n\n");
          }

        }
      
    // Task 4 - Write a function that lets the user choose a spot
    public static int[] askUser(char[][] board) {
      System.out.print(" - pick a row and column number: ");
      int row = scan.nextInt();
      int element = scan.nextInt();
      while (board[row][element] != '_') {
        System.out.print("Spot taken, try again: ");
        row = scan.nextInt();
        element = scan.nextInt();
      }
      return new int[] {row, element};
    }

    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */


}
