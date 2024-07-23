public class permutations {

    public static void stringPermutations(String str, String ans){

        // Time Complexity -- O(n*n)!
        // base case
        if(str.length() == 0){
            System.out.print(ans+" ");
            return;
        } 

        // recursion work 
        for(int i=0; i<str.length(); i++){

            char curr = str.charAt(i);

            // removing current char eg "abc" after removing curr char it becomes "bc"
            String ns = str.substring(0,i) +  str.substring(i+1);
            stringPermutations(ns, ans + curr);
        } 

    }
    public static void main(String[] args) {

        String str = "abc";
        stringPermutations(str, "");

    }
}
 