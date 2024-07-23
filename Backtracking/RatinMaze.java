public class RatinMaze {

    public static void mazePath(int[][] arr, int i , int j, String path){

        // Base case
        if (i<0 || j<0 || i==arr.length || j==arr.length || arr[i][j] == 0) {
            return;
        }

        if (i==arr.length-1 && j==arr.length-1) {
            System.out.println(path);
            return;
        }

        arr[i][j] = 0; // on the current block you,re standing

        mazePath(arr, i-1, j, path+"U");  // for going row upwards
        mazePath(arr, i+1, j, path+"D" ); // for going row downwards
        mazePath(arr, i, j-1, path+"L");  // for going to left col 
        mazePath(arr, i, j+1, path+"R");  // for going to right col

        arr[i][j] = 1;

    }
    public static void main(String[] args) {

        // int n = 4;
        int[][] arr = {
                        {1, 0, 0, 0},
                        {1, 1, 0, 0},
                        {0, 1, 1, 0},
                        {0, 1, 1, 1}
                      };

        mazePath(arr, 0, 0, "");

    }   
}
