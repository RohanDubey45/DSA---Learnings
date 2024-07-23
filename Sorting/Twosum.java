// import java.util.Arrays;

// public class Twosum {
    
//     // public static int[] twoSum(int[] nums, int target) {

        
//     //     int ans[] = new int[2];
//     //     for(int i=0; i<nums.length; i++)
//     //     {
//     //         for(int j=i+1; j<nums.length; j++)
//     //         {
//     //             if (nums[i] + nums[j] == target) {
//     //                 ans[0] = i;
//     //                 ans[1] = j;
//     //                 return ans;
//     //             }
//     //         }
//     //     }
//     //     return new int[0];
//     // }

//     // not correct
//     // public static int[] twoSum(int arr[], int target){
//     //     int ans[] = new int[2];

//     //     int start = 0; 
//     //     int end = arr.length-1;

//     //     while (start <= end) {

//     //         if (arr[start]+arr[end]==target) {
//     //             ans[0]= start;
//     //             ans[1]= end;
//     //             return ans;
//     //         }
//     //         else if (arr[start]+arr[end] > target) {
//     //             end--;
//     //         }
//     //         else{
//     //             start++;
//     //         }
//     //     }
//     //     return new int[0]; // if ans not found 
//     // }
   
    
//     public static void main(String[] args) {
//         int arr[] = {3,2,4};
//         int target = 6;
       
//         int[] ans = twoSum(arr,target);
//         System.out.println(Arrays.toString(ans));
//     }
// }
