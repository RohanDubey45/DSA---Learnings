public class spiral {

    public static void printSprial(int arr[][]){

        if (arr==null || arr.length == 0) {
            return;
        }

        int rowStart = 0;
        int rowEnd = arr.length-1;
        int colStart = 0;
        int colEnd = arr[0].length-1;

        while (rowStart <= rowEnd && colStart <= colEnd) {

            // Top row
            for(int j=colStart; j<=colEnd; j++){
                System.out.print(arr[rowStart][j]+" ");
            }
            rowStart++;

            // End col
            for(int i=rowStart; i<=rowEnd; i++){
                System.out.print(arr[i][colEnd]+" ");
            }
            colEnd--;

            // Bottom row
            if (rowStart <= rowEnd) {
                for(int j=colEnd; j>=colStart; j--){
                    System.out.print(arr[rowEnd][j]+" ");
                }
                rowEnd--;
            }

            // Start col
            if (colStart <= colEnd) {
                for(int i=rowEnd; i>=rowStart; i--){
                    System.out.print(arr[i][colStart]+" ");
                }
                colStart++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}

            // one col array 
            // {1},
            // {2},
            // {3},
            // {4},
        };
        printSprial(arr);

        // String s1 = new String("abcd");
        // String s2 = new String("abcd");
        // System.out.println(s1==s2); // false pointing to different memory location
        // System.out.println(s1.equals(s2)); // true  as both strings have same value
        // System.out.println(s1.compareTo(s2)); // 0 as both strings are equal
        // System.out.println(s1.intern()); // intern is what is finally stored in string

    }
}
