import java.util.*;

public class Loops {
    public static void main(String[] args) {
        // While loop
        // int i = 0;
        // while (i < 99) {
        //     System.out.println("Hello World");
        //     i++;
        // }
        // System.out.println("printed hello world 100x");

        // Infinite while loop means never ending loop
        // while (true) {
        //     System.out.println("radhe radhe");
        // }

        // int i = 1;
        // while (i <= 10){
        //     System.out.print(i+" ");
        //     i++;
        // }

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter n: ");
        // int n = sc.nextInt();

        // int i = 1;
        // while (i <= n) {
        //     System.out.print(i + " ");
        //     i++;
        // }

        // int sum = 0;
        // int i = 1;
        // while (i <= n) {
        //     sum += i;
        //     i++;
        // }
        // System.out.println(sum);
        
        // For loop
        // for(int i = 1; i <= 4; i++){
        //     System.out.println("* * * *");
        // }

        // To print the reverse of a number 

        // int num = 10899;
        // int temp = num;
        // int ans = 0; // reverse ans

        // while (num > 0) {
        //     int lastdigit = num % 10;
        //     ans = ans * 10 + lastdigit;
        //     num = num / 10;
        // }
        // System.out.println("Reverse of "+ temp + " is : " + ans);


        // other method alternative to reverse a number
        // while ( num >  0 ) {
        //     int lastdigit = num % 10;
        //     System.out.print(lastdigit);
        //     num /= 10;   
        // }


    // for (int i = 0; i < 5; i++){
    //     System.out.println("hello world");
    //     i += 2; // here i value is increemented 2 times 
    // }

    // for(int i = 0; i < 5; i += 2){
    //     System.out.println("hello world");
    // }

    // To print the multiplication of a table 
    // System.out.print("Enter n: ");
    // int n = sc.nextInt();
    // System.out.println("Multiplication Table of "+n);
    // for (int i = 1; i <= 10; i++) {
    //     System.out.println(n + " x " + i + " = " + n * i);
    // }

    // if multiple of 10 then break otherwise take input
    // while(true){
    //     System.out.print("Enter n: ");
    //     int n = sc.nextInt();
    //     if (n % 10 == 0) {
    //         System.out.println("you are out you entered multiple of 10");
    //         break;
    //     }
    // }

    // for (int i = 1; i < 6; i++) {
    //     if (i == 3) {
    //         continue;
    //     }
    //     System.out.println(i);
    // }

    // do{
    //     System.out.print("Enter n: ");
    //     int n = sc.nextInt();
    //     if (n % 10 == 0) {
    //         continue;   // continue skips the iteration
    //     }
    //     System.out.println("number was: "+n);
    // }while(true);

    
    // Prime Number Solution
    // System.out.print("Enter n: ");
    // int n = sc.nextInt();
    // if (n <= 1) {
    //     System.out.println("non-prime number");
    // }
    // else if (n == 2) {
    //     System.out.println("prime number");
    // }
    // else{
    //     boolean isPrime = true;
    //     for (int i = 2; i <= Math.sqrt(n); i++) {
    //         if (n % i == 0) {
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     if (isPrime) {
    //         System.out.println("prime number");
    //     }
    //     else{
    //         System.out.println("non-prime number");
    //     }
    // }

    // Factorial of a number solution
    Scanner sc = new Scanner(System.in);

    // System.out.print("Enter number: ");
    // int n = sc.nextInt();

    // if(n < 0){
    //     System.out.println("Invalid Number");
    // }
    // else if (n == 0 || n == 1){
    //     System.out.println("Factorial of "+n+ " : "+ 1);
    // }
    // else{
    //     int fac = 1;
    //     for(int i = 1; i<=n; i++){
    //         fac *= i;
    //     }
    //     System.out.println("Factorial of "+n+ " : " + fac);
    // }

    // // Take input of integers and print sum of odd and even nos 
    // int sumEven = 0;
    // int sumOdd = 0;

    // while (true) {

    //     System.out.print("Enter number: ");
    //     int n = sc.nextInt();
    //     if (n % 2 == 0) {
    //         sumEven += n;
    //     }
    //     else{
    //         sumOdd += n;   
    //     }

    //     System.out.print("To continue press 1 for yes and 2 for no: ");
    //     int choice = sc.nextInt();
    //     if (choice == 1) {
    //         continue;
    //     }
    //     else{
    //         break;
    //     }

    // }
    // System.out.println("Sum of even no.s: "+sumEven);
    // System.out.println("Sum of even no.s: "+sumOdd);


    // Take input of integers and print sum of odd and even nos using do while loop
    // int sumEven = 0;
    // int sumOdd = 0;
    // int choice;
    // do {
    //     System.out.print("Enter number: ");
    //     int n = sc.nextInt();
    //     if (n % 2 == 0) {
    //         sumEven += n;
    //     }
    //     else{
    //         sumOdd += n;
    //     }
    //     System.out.print("To continue press 1 for yes & 2 for no: ");
    //     choice = sc.nextInt();
    // }while(choice == 1);

    // System.out.println("Sum of even no.s: "+sumEven);
    // System.out.println("Sum of even no.s: "+sumOdd);

    // Palindrome number 
    // int num = 132;
    // int temp = num;
    // int rev = 0;
    // while (num > 0) {
    //     int rem = num % 10;
    //     rev = rev * 10 + rem;
    //     num /= 10;
    // }
    // if(temp == rev){
    //     System.out.println("PALINDROME ");
    // }
    // else{
    //     System.out.println("NOT PALINDROME");
    // }

    // Palindrome String 
    // String str = "rohan";
    // String rev = "";
    // for(int i = str.length() - 1; i >= 0; i--){
    //     rev += str.charAt(i);
    // }
    // if (str.equals(rev)) {
    //     System.out.println("palindrome string");
    // }
    // else{
    //     System.out.println("non palindrome");
    // }


    
    
    
    
    sc.close();
    }
}
