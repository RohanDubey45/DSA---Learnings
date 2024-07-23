// import java.util.Scanner;

public class StringBasics{
    public static void main(String[] args) {
        
        // char array
        // char[] ch = {'a','b','c','d'};

        // two methods two create strings
        // String str = "Rohan";
        // String str1 = new String("Justin");

        // Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // It take only a single word 

        // String name1 = sc.nextLine(); // It take full line
        // System.out.println(name1);
        // System.out.println(name1.length()); // It gives length and it is a function


        // Concatenation 
        String fName = "Rohan";
        String lName = "Dubey";
        String fullname = fName + " " + lName;
        System.out.println(fullname);


        // this charAt() method access the elements through index and starts with 0
        // System.out.println(fullname.charAt(10));

        printAllLetters(fullname);

        // sc.close();
    }
    public static void printAllLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
}