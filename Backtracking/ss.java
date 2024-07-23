public class ss {

    public static boolean isSafe(int[][] sudoku, int row, int col, int digit){

        // row wise 
        for(int j=0; j<sudoku.length; j++){
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // col wise
        for(int i=0; i<sudoku.length; i++){
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // grid wise
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        
        return true;
    }

    public static void sudokuSolver(int[][] sudoku, int row, int col){

        if (row == sudoku.length) {
            printSudoku(sudoku);
            return;
        }

        int newRow = row; 
        int newCol = col+1;
        if (newCol == sudoku.length) {
            newRow = row+1;
            newCol = 0;
        }

        if (sudoku[row][col] != 0) {
            sudokuSolver(sudoku, newRow, newCol);
            return;
        }

        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                sudokuSolver(sudoku, newRow, newCol);
                sudoku[row][col] = 0; 
            }
        }

    }

    public static void main(String[] args) {
        int[][] sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        sudokuSolver(sudoku, 0, 0);

    }

    public static void printSudoku(int[][] sudoku){
        for(int i=0; i<sudoku.length; i++){
            for(int j=0; j<sudoku.length; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    
}

