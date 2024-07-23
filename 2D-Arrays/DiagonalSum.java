public class DiagonalSum {

    public static int diagonalsum(int[][] arr){

        // Bruteforce  Time Complexity O(n^2)
        // int sum = 0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if (i == j) {
        //             sum += arr[i][j];
        //         }
        //         if (i!=j && i+j == arr.length-1 ) {
        //             sum += arr[i][j];
        //         }
        //     }
        // }
        // return sum;


        // Time Complexity O(n)
        int sum=0;
        for(int i=0; i<arr.length; i++){
            // pd
            sum += arr[i][i];
            //sd
            if(i != arr.length-1-i){
                sum += arr[i][arr.length-1-i];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        
        int[][] matrix = {
                                {1,2,3,4},
                                {5,6,7,8},
                                {9,10,11,12},
                                {13,14,15,16}
        };

        // int[][] matrix = {
        //                     {1,2,3},
        //                     {4,5,6},
        //                     {7,8,9}
                                    
        // };

        int ans = diagonalsum(matrix);
        System.out.println(ans);
    }
}
