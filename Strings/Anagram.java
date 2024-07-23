import java.util.Arrays;

public class Anagram {

    // public static boolean isAnagam(String s1, String s2){

    //     // converting them to lowercase which eliminates case comparison
    //     s1  = s1.toLowerCase();
    //     s2  = s2.toLowerCase();

    //     if (s1.length() == s2.length()) 
    //     {
    //         // converting both the strings to character array
    //         char[] ch1 = s1.toCharArray();
    //         char[] ch2 = s2.toCharArray();

    //         // now sort both the arrays
    //         Arrays.sort(ch1);
    //         Arrays.sort(ch2);

    //         boolean result = Arrays.equals(ch1, ch2);
    //         if (result){
    //             return true;
    //         }
    //         return false;

    //     }
    //     else
    //     {
    //         return false;
    //     }


    // }
    public static boolean checkAna(String s , String t){
        char[] ch1 = s.toLowerCase().toCharArray();
        char[] ch2 = t.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
    public static void main(String[] args) {
        String str1 = "carrace";
        String str2 = "racecar";

        boolean ans = checkAna(str1, str2);
        System.out.println(ans);
    }
}
