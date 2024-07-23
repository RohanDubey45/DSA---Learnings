public class Qsort {

    public static void quickSort(int[] arr, int start, int end){

        if (start >= end) {
            return;
        }
        
        // Finding pivot index
        int pi = partition(arr, start, end);

        quickSort(arr, start, pi-1);
        quickSort(arr, pi+1, end);

    }
    public static int partition(int[] arr, int start , int end){
        
         // pivot last element 
         int pivot = arr[end];
         int i = start-1;
         
         for(int j = start; j < end; j++){
            if (arr[j] < pivot) {
                i++;
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
         }

        // bringing pivot to it's correct index and then returning that pivot index
        i++;
        int tmp = pivot;
        arr[end] = arr[i];
        arr[i] = tmp;

        return i; // pivot index
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {6, 3, 9, 8, 2, 5};
        // int[] arr1 = {5,1,1,2,0,0};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);

    }
    
}
