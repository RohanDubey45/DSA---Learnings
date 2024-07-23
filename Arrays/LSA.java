public class LSA {

    public static int findTarget(int nums[], int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int find_Largest_Smallest(int nums[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
            if (nums[i]<smallest) {
                smallest = nums[i];
            }
        }
        System.out.println("Smallest is: "+smallest);
        return largest;
    }

    public static int findSong(String songs[], String target){
        for(int i=0; i<songs.length; i++){
            if (songs[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        // int nums[] = {1, 2, 3, 4, 5, 6};
        // int target = 2;

        // int ans = findTarget(nums, target);
        // if (ans == -1) {
        //     System.out.println("Target not found");
        // }
        // else{
        //     System.out.println("Element is at index: "+ans);
        // }

        // int max = find_Largest_Smallest(nums);
        // System.out.println("Largest is: " +max);

        String songs[] = {"this feeling", "coldwater", "sorry", "letmeloveyo"};
        String target = "tumse";

        int ans = findSong(songs, target);
        if (ans == -1) {
            System.out.println("Song not found");
        }
        else{
            System.out.println("Song is at index: "+ ans); 
        }
 
        

    }
}
