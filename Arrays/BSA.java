public class BSA {
    public static int BinarySearch(int nums[], int key){
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = (start+end)/2;

            if (nums[mid]==key) {
               return mid; 
            }
            else if(nums[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void reverse(int nums[]){
        int first = 0;
        int last = nums.length-1;

        while (first<last) {
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            
            first++;
            last--;
        }

    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 7};
        int key = 5;
        System.out.println(BinarySearch(nums, key));

        // reverse(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.print(nums[i]+" ");
        // }

    }
}
