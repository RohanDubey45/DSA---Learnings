// import java.util.Arrays;

// public class RunningSum {

//     // also known as Running sum of 1d array using prefix sum
//     public static int[] runningsum(int nums[]){
//         int n = nums.length;
//         int prefix[] = new int[n];

//         prefix[0] = nums[0];
//         for(int i=1; i<n; i++){
//             prefix[i] = prefix[i-1] + nums[i];
//         }
//         return prefix; // returning the prefix sum array 
//     }

//     // prefix sum in range or running sum of 1d array in a range
//     public static int runningsum_range(int arr[], int l, int r){

//         int n = arr.length;
//         int[] prefix = new int[n];

//         prefix[0] = arr[0];

//         for(int i=1; i<n; i++){
//             prefix[i] = prefix[i-1] + arr[i];
//         }

//         if (l==0) {
//             return prefix[r];
//         }
//         else{
//             return prefix[r] - prefix[l-1];
//         }

//     }
//     public static void main(String[] args) {
//         int nums[] = {1, 2, 3, 4, 5};

//         // int ans1[] = runningsum(nums);
//         // System.out.println(Arrays.toString(ans1));

//         // prefix sum in range
//         int ans = runningsum_range(nums, 2, 4);
//         System.out.println(ans);

//     }
// }
