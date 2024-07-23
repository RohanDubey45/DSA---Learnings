import java.util.Scanner;

public class Arrays2D {

    // search element in 2D array
    public static void search(int arr[][], int key){

        int n = arr.length;     // Number of Rows
        int m = arr[0].length;  // Number of Cols

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if (arr[i][j]==key)
                {
                    System.out.println("Element Found at: "+"("+i+","+j+")");
                    return;
                }
            }
        }
        System.out.println("Element not found!!!");

    }

    // find max in 2D array
    public static int Max(int arr[][]){

        int index[] = new int[2];

        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int m = arr[0].length;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if (arr[i][j] > max)
                {
                    index[0] = i;
                    index[1] = j;
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Element found at index: "+index[0]+","+index[1]);
        return max;
    }

    // find min in 2D array
    public static int Min(int arr[][]){

        int[] index = new int[2];
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        int m = arr[0].length;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if (arr[i][j] < min)
                {
                    index[0] = i;
                    index[1] = j;
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Element found at index: "+index[0]+","+index[1]);
        return min;
    }

    public static void main(String[] args) {

        // Creation of 2D array , input & output 

        int arr[][] = new int[3][3];
        int n = arr.length;
        int m = arr[0].length;

        Scanner sc = new Scanner(System.in);

        // Taking the input for 2d array 
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j] = sc.nextInt(); 
            }
        }

        // Output of 2d array 
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        search(arr, 91);

        // int max = Max(arr);
        // System.out.println("Max element is: "+max);

        // int min = Min(arr);
        // System.out.println("Min element is: "+min);


        sc.close();
    }
}
