import java.util.*;

public class Lonely {

    static ArrayList<Integer> lonelyNums(ArrayList<Integer> list){

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if (list.get(i) > max) max = list.get(i);
        }

        int[] count = new int[max+2];

        for(int i=0; i<list.size(); i++){
            count[list.get(i)]++;
        }

        ArrayList<Integer> res = new ArrayList<>();

        for(int i=1; i<count.length-1; i++){

            // checking for the first index ie. i=0
            if (i==0 && count[i] == 1 && count[i+1] == 0) {
                res.add(i);
            }

            // checking for the last index ie. i=count.length-1
            else if((i==count.length-1) && count[i] == 1 && count[i-1] == 0) {
                res.add(i);
            }

            else if(count[i] == 1 && count[i-1] == 0 && count[i+1] == 0){
                res.add(i);
            }

        }
        
        return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(101, 103, 200, 199, 203));

        ArrayList<Integer> ans = lonelyNums(list);
        System.out.println(ans);
    } 
}
