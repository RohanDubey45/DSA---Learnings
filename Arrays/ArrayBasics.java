import java.util.Scanner;

public class ArrayBasics {

    public static void updateRollno(int rollno[]){
        // for updating the values of array
        for (int i = 0; i < rollno.length; i++) {
            rollno[i] += 1;
        }

        // Arrays are call by reference meaning that function changes are
        // also visible in the main function i.e it update the arrya in the main function
    }
    public static void main(String[] args) {
        // int marks[] = new int[500];
        // System.out.println("Length of array: "+ marks.length);

        // Taking array input
        Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("Phy: " + marks[0]);
        // System.out.println("Chem: " + marks[1]);
        // System.out.println("Math: " + marks[2]);

        // marks[1] = marks[1] + 1;
        // System.out.println("Chem: " + marks[1]);

        sc.close(); 

        int rollno[] = {23, 24, 19, 28};

        updateRollno(rollno);

        // for printing the values of array
        for(int i=0; i<rollno.length; i++){
            System.out.print(rollno[i]+" ");
        }
        System.out.println();

    }
}
