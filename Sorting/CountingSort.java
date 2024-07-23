public class CountingSort {

    public static void CountSort(int arr[]){

        int n= arr.length;
        int max= Integer.MIN_VALUE;

        // Step1 - find the max from the array
        for(int i=0; i<n; i++)
        {
            if (arr[i] > max) {
                max= arr[i];
            }
        }
        System.out.println(max);

        // Step2 - create a array of max+1 size so that we add occurence of max element 
        int count[] = new int[max+1];

        // Step3 - traverse our original for loop and then increement occurence of element in the count array
        for(int i=0; i<n; i++)  // Storing occurences of every number
        {
            int element = arr[i];
            count[element]++;
        }

        int k= 0;
        for(int i=0; i<count.length; i++)
        {
            while (count[i]>0) {
                arr[k]= i;     // updating our original array at the kth index position
                k++;          // increementing so that we can go to nx element
                count[i]--;  // loop breaking condition
            }
        }

    }

    // Normal Print Array function to print the elements of array
    public static void printArray(int arr[]){

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        // int arr[] = {6, 6, 2, 4, 1, 5};
        // CountSort(arr);
        // printArray(arr);
    }
}
