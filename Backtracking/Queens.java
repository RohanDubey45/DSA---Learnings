public class Queens {

    // N-Queens Time Complexity -- O(n!)

    public static boolean isSafe(char[][] board , int row, int col){

        // vertically up
        for(int i=row-1; i>=0; i--){
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for(int i=row-1, j=col-1; i >=0 && j>=0; i--, j--){
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
        
    }

    static int count = 0; // it will keep a count total ways to place n queens for nxn board

    public static void nqueens(char[][] board, int row){
        // Time complexity -- O(n!)

        if (row == board.length) {
            printChessBoard(board);
            count++;
            return;
        }

        // column loop
        for(int j=0; j<board.length; j++){
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // queen sit
                nqueens(board, row+1); // recursion to go for next row 
                board[row][j] = '.';   // Backtracking step 
            }
        }

    }
    public static void main(String[] args) {
        int n = 4;

        char[][] board = new char[n][n]; // n x n board 

        // chess board initialise
        for(int i=0; i<n; i++){
            for (int j = 0; j<n; j++) {
                board[i][j] = '.';
            }
        }

        nqueens(board, 0);

        System.out.println("total ways for n queens are: "+count);
    }
    public static void printChessBoard(char[][] board){
        System.out.println("---------- CHESS BOARD ----------"); 
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
