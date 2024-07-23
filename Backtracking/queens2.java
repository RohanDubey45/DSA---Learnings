public class queens2 {

        // N-Queens Time Complexity -- O(n!)

        // Function to check if it's safe to place a queen at board[row][col]
        public static boolean isSafe(char[][] board, int row, int col) {

            // Check vertically upwards
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][col] == 'Q') {
                    return false;
                }
            }
    
            // Check diagonal left upwards
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
    
            // Check diagonal right upwards
            for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
    
            return true;
        }
    
        // Recursive function to solve the N-Queens problem
        public static void nqueens(char[][] board, int row) {

            // Base case: if all queens are placed
            if (row == board.length) {
                printChessBoard(board);
                return;
            }
    
            // Try placing a queen in all columns one by one
            for (int j = 0; j < board.length; j++) {

                if (isSafe(board, row, j)) {   
                    board[row][j] = 'Q'; // Place queen
                    nqueens(board, row + 1); // Using Recursion to place the rest of n-1 queens
                    board[row][j] = '.'; // Backtrack so that no two queens are in the same row
                }

            }

        }
    
        // Main function to set up the board and start the N-Queens problem
        public static void main(String[] args) {
            // int n = 4; // You can change the size of the board here
    
            // char[][] board = new char[n][n]; // n x n board
    
            // // Initialize the chess board with every board[i][j] = '.'
            // for (int i = 0; i < n; i++) {
            //     for (int j = 0; j < n; j++) {
            //         board[i][j] = '.';
            //     }
            // }
    
            // nqueens(board, 0);


        }
    
        // Function to print the chess board
        public static void printChessBoard(char[][] board) {
            System.out.println("---------- CHESS BOARD ----------");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }


}
    

