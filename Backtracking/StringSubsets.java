public class StringSubsets {

    public static void subset(String str, String ans, int i){
        // time complexity -- O(n * 2 raise to n)
        // base case print the string when it reaches the length
        if (i == str.length()) {
            System.out.print(ans+" ");
            return;
        }

        // recursive work when every character wants to come to the string
        subset(str, ans + str.charAt(i) , i+1);

        // BACKTRACKING --- when character is not coming for string 
        subset(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "aba";
        subset(str, "", 0);
    }
}
