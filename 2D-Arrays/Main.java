public class Main {

    // public static int prefixSum(int[] arr, int l , int r){

    //     int n = arr.length;
    //     int[] prefix = new int[n];
    //     prefix[0] = arr[0];

    //     for (int i = 1; i < n; i++) {
    //         prefix[i] = prefix[i-1] + arr[i];
    //     }
    //     if (l==0) {
    //         return prefix[r];
    //     }
    //     else{
    //         return prefix[r] - prefix[l-1];
    //     }

    // }
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        // int ans = prefixSum(arr, 1, 3);
        // System.out.println(ans);

        // Max subarray sum
        // int nums[] = {-5, -3, -7, -9};

        // int sum = 0;
        // int maxSum = Integer.MIN_VALUE;

        // for(int i=0; i<nums.length; i++){
        //     sum += nums[i];

        //     if(sum > maxSum)
        //     {
        //         maxSum = sum;
        //     }
        //     if(sum < 0)
        //     {
        //         sum = 0;
        //     }
        // }
        // System.out.println(maxSum);

        // pairs in array
        int[] arr = {1,2,3,4};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print(arr[i]+" "+arr[j]);
            }
        }

    }

}
