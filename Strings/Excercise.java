// import java.util.Scanner;

public class Excercise {

    // count the number of lowercase vowels in the input string 
    public static int findVowelCount(String str){
        
        // traverse the string 
        int count = 0;
        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);
            
            if (Character.isLowerCase(ch)) {
                if (ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your string: ");
        // String str = sc.next();

        // int ans = findVowelCount(str);
        // System.out.println(ans);

        // String str = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));

        // String str = "ApnaCollege".replace("l","");
        // System.out.println(str);


        // String s3 = "hello";
        // String s4 = "hello";
        // System.out.println(s3.intern()==s4.intern());
        // System.out.println(s4.intern());  

        // intern method checks that what is finally stored in the string that is the value
        // sc.close();

        String str = "justin";
        char[] ch = str.toCharArray();

        // Traverse the character array
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]+" ");
        }
        System.out.println();

    }
}
