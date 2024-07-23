public class Msort {

    public static int[] mergeSort(int[] arr, int start, int end){

        // base case - when we have only one element remaining in the array so start = end 
        if (start == end) {
            int[] temp = new int[1];
            temp[0] = arr[start];
            return temp;
        }

        int mid = start + (end-start)/2;

        int[] left = mergeSort(arr, start, mid);
        int[] right = mergeSort(arr, mid+1, end);

        return mergeArrays(left, right);

    }
    public static int[] mergeArrays(int[] left, int[] right){

        int n = left.length;
        int m = right.length;

        // resultant array
        int[] res = new int[n+m];

        int i = 0; // iterate left array
        int j = 0; // iterate right array
        int k = 0; // iterate resultant array

        while (i<n && j<m) {

            if (left[i] < right[j]) {
                res[k] = left[i];
                i++;
            }
            else{
                res[k] = right[j];
                j++;
            }
            k++;
        }
        // remaining elements in the left array
        while (i<n) {
            res[k++] = left[i++];
        }
        // remaining elements in the right array
        while (j<m) {
            res[k++] = right[j++];
        }

        return res;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] arr = {6, 3, 9, 5, 4, 8};
        
        // before sorting
        System.out.print("Array before sorting: ");
        printArray(arr);

        // after sorting
        int res[] = mergeSort(arr, 0, arr.length-1);
        System.out.print("Array after sorting: ");
        printArray(res);
        
    }
}
