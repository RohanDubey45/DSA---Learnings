public class BubbleSort {

    // public static void Bubblesort(int arr[]){
    //     int n = arr.length;
    //     for(int turn=0; turn<n-1; turn++){
    //         int Total_Swaps = 0;
    //         for(int j=0; j<n-1-turn; j++){   // j<n-1-turn  OR  j<=n-2-turn both are correct         
    //             if (arr[j] > arr[j+1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //                 Total_Swaps++;
    //             }
    //         }
    //     System.out.println("Total swaps are: "+Total_Swaps);
    //     }
    // }

    public static void Bubblesort2(int arr[]){

        int n = arr.length;

        for(int i=0; i<n-1; i++){

            for(int j=0; j<n-1-i; j++){

                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            } 
        }

    }
    public static void SelectionSort(int arr[]){
        int n = arr.length;
        
        for(int i=0; i<n-1; i++){
            int minElement = i;
            for(int j=i+1; j<n; j++){
                if (arr[j] > arr[minElement]) {
                    minElement = j;
                }
            }
            if (minElement != i) {
                int temp = arr[i];
                arr[i] = arr[minElement];
                arr[minElement] = temp;
            }
        }
    }
    
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swap(int arr[] , int element1, int element2){

        int temp = arr[element1];
        arr[element1] = arr[element2];
        arr[element2] = temp;

    }
    public static void main(String[] args) {

        // int arr[] = {5, 3, 8, 4, 2};
        // SelectionSort(arr);
        // printArray(arr);

        
        // swap(arr, 0, 1);
        // printArray(arr);

    }
}
