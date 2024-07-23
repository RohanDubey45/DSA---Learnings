import java.util.*;

public class PairSum {
    // Two pointer approach - O(n)
    static boolean sum(ArrayList<Integer> list, int target){

        int left = 0;
        int right = list.size()-1;

        while (left < right) {

            if (list.get(left) + list.get(right) == target) {
                System.out.println("Target found at index: "+left+","+right);
                return true;
            }

            else if (list.get(left) + list.get(right) > target) {
                right--;
            }

            else{
                left++;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        int target = 5;

        System.out.println(sum(list, target));

        
    }
}
