import java.util.*;

public class Pairsum2 {
    // Two pointer approach O(n)
    
    public static boolean findTargetSum(ArrayList<Integer> list, int target){
        // initially our breaking point is -1 as we dont know at which point our array is rotated
        int bkp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i+1)) {
                bkp = i;
                break;
            }
        }

        // now we have our array breaking point as bkp
        int left = bkp + 1;
        int right = bkp;
        int n = list.size();

        while (left != right) {

            // case 1 :- 
            if (list.get(left) + list.get(right) == target) {
                return true;
            }

            // case 2 :-
            else if(list.get(left) + list.get(right) > target) {
                right = (n + right - 1) % n;
            }

            // case 3 :-
            else{
                left = (left + 1) % n;
            }

        }

        return false;
    }
    public static void main(String[] args) {
        // sorted and rotated list
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11, 15, 6, 8, 9, 10));
        int target = 170;

        System.out.println(findTargetSum(list, target));

    }
}
