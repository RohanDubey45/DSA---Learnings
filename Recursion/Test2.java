// import java.util.Arrays;

public class Test2 {

    public static int[] mergerSortedArrays(int[] arr1, int[] arr2)
    {
        int n = arr1.length;
        int m = arr2.length;

        // creating n+m length of array which will have all elements sorted
        int[] res = new int[n+m];

        int i = 0; // iterator i for arr1
        int j = 0; // iterator j for arr2
        int k = 0; // iterator k for res arr

        while (i<n && j<m)
        {
            if (arr1[i] < arr2[j]){
                res[k] = arr1[i];
                i++;
            }
            else{
                res[k] = arr2[j];
                j++;
            }
            k++;
        }

        // if elements of arr1 is pending then we copy all remaining elements as it is in k
        while (i<n)
        {
            res[k] = arr1[i];
            i++;
            k++;
        }

        // if elements of arr2 is pending then we copy all remaining elements as it is in k
        while (j<m)
        {
            res[k] = arr2[j];
            j++;
            k++;
        }

        return res;

    }

    public static void printArr(int[] res)
    {
        // printing our resultant sorted array
        for(int i=0; i<res.length; i++)
        {
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }

    public static int[] mergeSort(int[] arr, int start, int end)
    {

        if (start == end) {
           int[] res = new int[1];
           res[0] = arr[end];
           return res;
        }

        int mid = start + (end - start)/2;

        // sorted arrays 
        int[] left = mergeSort(arr, start, mid);   // left part sorted
        int[] right = mergeSort(arr, mid+1, end);  // right part sorted 

        return mergerSortedArrays(left, right);

    }

    public static int inversionCount(int[] arr)
    {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            int element = arr[i];

            for(int j=i-1; j>=0; j--)
            {
                if (arr[j] > element)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args)
    {

        // int[] arr1 = {1, 2, 3, 0, 0, 0};
        // int[] arr2 = {2, 5, 6};

        // System.out.println(Arrays.toString(mergerSortedArrays(arr1,arr2)));

        // int[] arr = {6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
        // int[] arr = {4, 2, 7, 1, 3};
        // int[] sorted = mergeSort(arr, 0, arr.length-1);

        // printArr(sorted);

        // int[] arr = {2, 4, 1, 3, 5};
        int[] arr1 = {4,1,7,2,9,5};
        int ans = inversionCount(arr1);
        System.out.println(ans);

    }
}
