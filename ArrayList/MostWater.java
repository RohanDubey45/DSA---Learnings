import java.util.*;

public class MostWater {
    
    // Time Complexity - O(n) Two Pointer approach
    static int mostWater(ArrayList<Integer> height){

        int start = 0;
        int end = height.size()-1;
        int maxWater = 0;

        while (start < end) {

            // cal height for water
            int ht = Math.min(height.get(start), height.get(end));

            // cal width for water
            int wt = end - start;

            // cal area for water
            int area = ht * wt;

            // finding mostWater area
            maxWater = Math.max(maxWater, area);

            // move pointer forward backward based on conditions
            if (height.get(start) < height.get(end)) {
                start++;
            }
            else{
                end--;
            }

        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(mostWater(height));
    }
}
