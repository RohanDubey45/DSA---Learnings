public class TrappingWater {

    public static int TrappedWater(int height[]){

        int n = height.length; // Taking the length of our height array

        if (height.length <= 2 || height[0] < height[1]) {
            return -1;
        }
        else{
        // cal. leftmax & rightmax boundary through array
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        // For leftmax
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        // For rightmax
        rightmax[n-1] = height[n-1]; // last element in array n-1
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int TrapWater = 0;
        for(int i=0; i<n; i++){
            // cal. waterlevel by taking min of left & rightmax
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // Tracking sum of TrapWater
            TrapWater += waterlevel - height[i];
        }

        return TrapWater;
        }

    }
    public static void main(String[] args) {

        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int ans = TrappedWater(height);
        System.out.println("Total amount of TrappedWater: "+ans);

        
        
    }
}
