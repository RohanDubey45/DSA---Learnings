public class InsertionSort {

    public static void Insertion(int arr[]){

        int n= arr.length;

        for(int i=0; i<=n-2; i++)
        {
            for(int j=i+1; j>0; j--)
            {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }

    }

    public static void printArray(int arr[]){

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static void swap(int arr[] , int element1, int element2){

        int temp = arr[element1];
        arr[element1] = arr[element2];
        arr[element2] = temp;

    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 1, 2}; // works well for -ve numbers
        Insertion(arr);
        printArray(arr);
    }
}
