public class excersicse {

    public static void count7(int[][] arr, int key){
        int n = arr.length;
        int m = arr[0].length; 

        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if (arr[i][j]==key) {
                    count++;
                }
            }
        }
        System.out.println("Count= "+count);
    }

    public static void rowSum(int[][] arr){
        // taking the row of 2nd sum or finding individual row sum in 2d matrix
        // int n = arr.length;    // Number of rows
        // int m = arr[0].length; // Number of cols

        // int sum = 0;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if (i==1) {
        //             sum+=arr[i][j];
        //         }
        //     }
        // }
        // System.out.println("Sum= "+sum);

        // second approach  here i value is replaced with 1
        // int sum = 0;
        // if (n <=1) {
        //     System.out.println("2nd row does'nt exits");
        // }
        // else{
        //     for(int j=0; j<m; j++){
        //         sum+=arr[2][j];
        //     }
        // }
        // System.out.println("Sum= "+sum);
        
    }
    public static void main(String[] args) {
        
        // int[][] arr = { {7, 7, 7},
        //                 {8, 8, 7},
        //                 {1, 2, 7},
        //               }; 

    // int key = 7;
    // count7(arr, key);
    // rowSum(arr);

    int[][] arr = { {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
                  }; 

    int target = 8;
    boolean ans = searchMatrix(arr,target);
    System.out.println(ans);
                
    }

    // Search in sorted matrix 2nd method
    public static boolean searchMatrix(int[][] arr, int target){

        if(arr==null || arr.length == 0 || arr[0].length < 1){
            return false;
        }

        int row = arr.length-1;
        int col = 0;

        while (row >= 0 && col<arr[0].length) {
            if(arr[row][col]==target){
                System.out.println("Element found at: "+row+","+col);
                return true;
            }
            else if(target < arr[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Element not found");
        return false;

    }

}
