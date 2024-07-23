
public class pairs {

    public static void ArrayPairs(int arr[]){
        int tp=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("For i = "+arr[i]);
            for (int j = i+1; j < arr.length; j++) {
                System.out.print(" ("+arr[i]+","+arr[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are: "+tp);
    }

    public static void SubArrays(int arr[]){

        int total_subarrays = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for (int k=i; k <=j; k++){
                    sum += arr[k];
                    System.out.print(arr[k]+" "+" ");
                }
                System.out.print("Sum is: "+sum);
                total_subarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays are: " +total_subarrays);

    }

    public static void MaxSubArray(int arr[]){
        int prefix[] = new int[arr.length];

        // calculate prefix array
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                curr_sum = i==0 ? prefix[end] : prefix[end] - prefix[start-1];
            }
            if (curr_sum>max_sum) {
                max_sum=curr_sum;
            }
        }
        System.out.println("Max subarray sum: "+max_sum);
    }

    public static void maxsumarray(int arr[]){
        int max_sum = arr[0];
        int curr_sum = arr[0];

        for(int i=0; i<arr.length; i++){
            curr_sum+=arr[i];
            if (curr_sum>max_sum) {
                max_sum=curr_sum;
            }
            if (curr_sum<0) {
                curr_sum=0;
            } 
        }
        System.out.println(max_sum);
    }

    public static void main(String[] args) {
        // ArrayPairs(arr);
        // SubArrays(arr);

        // pairs in array 
        // int arr[] = {2, 4, 6, 8, 10};
        // int total_paris = 0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=i+1; j<arr.length; j++){
        //         System.out.print(" ("+arr[i]+","+arr[j]+") ");
        //         total_paris++;
        //     }
        //     System.out.println();
        // }
        // System.out.println("Total pairs are: " +total_paris);


        // int arr[] = {1, -2, 6, -1, 3};
        int arr[] = {-2, -3, -4, -5};
        maxsumarray(arr);

        // SubArrays(arr);

        // int max_sum=Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i; j < arr.length; j++) {
        //         int curr_sum=0;
        //         for(int k=i; k<=j; k++){
        //             curr_sum+=arr[k]; // taking sum of individual subarray
        //         }
        //         System.out.println("current subarray sum: "+curr_sum);
        //         if (curr_sum > max_sum) { // updating max
        //             max_sum=curr_sum;
        //         }
        //     }
        // }
        // System.out.println("Maximum sum of subarray: "+max_sum);

        // MaxSubArray(arr);






    }
}
