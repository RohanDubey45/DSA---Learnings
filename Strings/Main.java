import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // sb modifies the original string more efficient memory efficiency
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch); // it is a function of sb to add elements in it 
        }
        System.out.println(sb);
        System.out.println(sb.length());

        // Time complexity is O(26) as it add 26 elements 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");

        // String str = sc.next();

        sc.close();

    }
    // count number of z in a string 
    public static int countZ(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'z') {
                count++;
            }
        }
        return count;
    }
}
