public class TrappingWater {

    public static void TotalRainwater(int arr[]){

        if (arr==null || arr.length == 0) {
            System.out.println("Trap water collected is 0");
            return;
        }
        
        int n = arr.length;

        // create leftbound and rightbound 
        int[] left_bound = new int[n];
        left_bound[0] = arr[0];
        for(int i=1; i<n; i++)
        {
            left_bound[i] = Math.max(left_bound[i-1], arr[i]);
        }

        int[] right_bound = new int[n];
        right_bound[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--)
        {
            right_bound[i] = Math.max(right_bound[i+1], arr[i]);
        }

        int total_water = 0;
        for(int i=0; i<arr.length; i++){
            int water_level = Math.min(left_bound[i], right_bound[i]);
            total_water += water_level - arr[i];
        }
        System.out.println("Total water stored is: "+total_water);

    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 6, 3, 2, 5};
        TotalRainwater(arr);
    }
}
