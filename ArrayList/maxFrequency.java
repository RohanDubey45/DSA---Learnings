import java.util.*;
// https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/submissions/1322782647/

public class maxFrequency {
    // spc O(n) tc O(n)
    static int MostFrequency(ArrayList<Integer> list, int key){
        int[] count = new int[1001];

        for(int i=0; i<list.size()-1; i++){   // given in question that loop runs till the 2nd last element

            if (list.get(i) == key) {
                count[list.get(i+1)]++;
            }

        }

        int maxValue = Integer.MIN_VALUE;
        int target = 0;

        for(int i=0; i<count.length; i++){
            if (count[i] > maxValue) {
                target = i;
                maxValue = count[i];
            }
        }

        return target;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 100, 1, 200, 1, 200));
        int key = 1;

        int ans = MostFrequency(list, key);
        System.out.println(ans);
    }
}
