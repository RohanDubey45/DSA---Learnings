// import java.util.Arrays;

public class Test {

    public static void swap(int arr[] , int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static int maxProfit(int[] prices) {
        // profit = selling price - buy price
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){

            // prices[i] is the SellingPrice of stocks on that day
            if(buyPrice < prices[i])
            {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
            else
            {
                // for i=0 it will be +2B which is not less 
                // so buyprice is updated with the current price
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int ans = maxProfit(prices);
        System.out.println(ans);

        // int[] arr = {1,2,3,4,5,6};
        // // int[] arr2 = {5,4,3,2,1,0};

        // // reverse the elements of the array
        // int start = 0;
        // int end = arr.length-1;

        // while (start < end) {
        //     swap(arr, start, end);
        //     start++;
        //     end--;
        // }

        // System.out.println(Arrays.toString(arr));

        // int[] arr = {5, 7, 10, 14};
        // int n = arr.length;
        // // print subarray

        // for(int i=0; i<n; i++)
        // {
        //     for(int j=i; j<n; j++)
        //     {
        //         for(int k=i; k<=j; k++)
        //         {
        //             System.out.print(arr[k]+" ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println(); // this will be i-th iteration 
        // }

        // int[] arr = {10, 20, 30, 40, 50, 60, 70};
        // int target = 100;

        // int ans = BinarySearch(arr,target);
        // System.out.println(ans);


    }
    // public static int BinarySearch(int arr[], int target){
    //     int start = 0;
    //     int end = arr.length-1;

    //     while (start <= end) {
    //         int mid = start+(end-start)/2;

    //         if (arr[mid]==target) {
    //             return mid;
    //         }
    //         else if(target<arr[mid]){
    //             end=mid-1;
    //         }
    //         else{
    //             start=mid+1;
    //         }
    //     }
    //     return -1;
    // }


}
