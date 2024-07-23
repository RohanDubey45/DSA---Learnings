import java.util.*;

// Time complexity of total code O(nlogn)
public class Lonely2 {

    public static ArrayList<Integer> lonelyNums(ArrayList<Integer> list){

        ArrayList<Integer> result = new ArrayList<>();
        int n = list.size();

        // sort the array
        Collections.sort(list); // Time Complexity nlogn

        for(int i=0; i<n; i++){   // Time Complexity O(n)

            // Case 1
            if(i != 0) {
                if (list.get(i) == list.get(i-1) || list.get(i)-1 == list.get(i-1)) {
                    continue;
                }
            }

            // Case 2
            if(i != n-1) {
                if (list.get(i) == list.get(i+1) || list.get(i)+1 == list.get(i+1)) {
                    continue;
                }
            }

            // If both conditions are false then add the element from list to result
            result.add(list.get(i));

        }

        return result;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 3));

        ArrayList<Integer> ans = lonelyNums(list);
        System.out.println(ans);
    }
}
