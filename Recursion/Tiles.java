public class Tiles {


    // Find number of totalways to place the tile vertically and horizontally both 
    public static int TilingProblem(int n){  // 2 x n size floor 
        // base case if 2x0 means no tile so only way ie. no tile and 2x1 means only one way of placing tile ie vertically

        if (n==0 || n==1) {
            return 1;
        }

        // vertical 
        int vertical = TilingProblem(n-1);

        // horizontal
        int horizontal = TilingProblem(n-2);

        int totalWays = vertical + horizontal;
        return totalWays;
        
    }

    public static boolean isSorted(int[] arr, int i)
    {
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] < arr[i+1]) {
            return isSorted(arr, i+1);
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(TilingProblem(6));

        // int[] arr = {1, 2, 3, 4, 5};
        // int index = 0;
        // System.out.println(isSorted(arr, index));

    }
}
