import java.util.*;

public class Occurences {
    // given an arraylist find the max count of an element in this list

    static int maxFrequency(ArrayList<Integer> list){

        int[] count = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            count[list.get(i)]++;
        }

        int ans = Integer.MIN_VALUE;
        int target = 0;

        for(int i=0; i<count.length; i++){
            if (count[i] > ans) {
                target = i;
                ans = count[i];
            }
        }

        return target;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,2,3,3,4,4,4,4,5));
        System.out.println(maxFrequency(list));
    }
}
