public class Test {

        public static boolean isSafe(char[][] board, int row, int col){

            // checking vertically up
            for(int i=row-1; i>=0; i--){
                if (board[i][col] == 'Q') {
                    return false;
                }
            }

            // checking diagonally left up
            for(int i=row-1, j=col-1; i >= 0 && j>=0; i--,j--){
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
            
            // checking diagonally right up
            for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
                if (board[i][j] == 'Q') {
                    return false;
                }
            }

            return true;
        }
        static int count = 0;
        public static void nQueens(char[][] board, int row){

            // Base case 
            if (row == board.length) {
                count++;
                printBoard(board);
                return;
            }

            // work
            for(int j=0; j<board.length; j++){
                if (isSafe(board, row, j)) {
                    board[row][j] = 'Q';
                    nQueens(board, row+1);
                    board[row][j] = '.';
                }
            }
        }
        public static void main(String[] args) {

            int n = 5;
            char[][] board = new char[n][n]; // n x n

            // board intialization
            for(int i=0; i<board.length; i++){
                for(int j=0; j<board.length; j++){
                    board[i][j] = '.';
                }
            }

            nQueens(board, 0);
            System.out.println("Total ways to solve N-Queens for n="+n+" is: "+count);
        }

    // print board function
    public static void printBoard(char[][] board){
        System.out.println("-----chess board------");

        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
