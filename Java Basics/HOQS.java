import java.util.Scanner;

public class HOQS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter n: ");
        // int n = sc.nextInt();

        // if (n % 3 == 0 && n % 5 != 0) {
        //     System.out.println("FIZZ");
        // }
        // else if (n % 5 == 0 && n % 3 != 0) {
        //     System.out.println("BUZZ");
        // }
        // else if (n % 3 == 0 && n % 5 == 0) {
        //     System.out.println("FIZZ-BUZZ");
        // }
        // else{
        //     System.out.println(n);
        // }

        // effective solution of fizz-buzz
        // if (n % 15 == 0) {
        //     System.out.println("FIZZ-BUZZ");   // this condition will work for 15 & 30 because there are only this two multiples which are common in 3 and 5 table
        // }
        // else if (n % 3 == 0) {
        //     System.out.println("FIZZ");
        // }
        // else if (n % 5 == 0) {
        //     System.out.println("BUZZ");
        // }
        // else{
        //     System.out.println(n);
        // }

        // GMT time to IST time
        // System.out.print("Enter month day hour minute: ");

        // int month = sc.nextInt();
        // int day = sc.nextInt();
        // int hour = sc.nextInt();
        // int min = sc.nextInt();

        // hour += 5;
        // min += 30;

        // if ((day >= 30) && (hour >= 20)) {
        //     month++;
        //     day -= 30;
        // }
        // if (hour >= 24) { // edge case for hours if it is greater than or =s to 24
        //     day++;
        //     hour -= 24;
        // }
        // if (min >= 60) { // edge case for minutes greater than or =s to 60
        //     hour++;
        //     min -= 60;
        // }
        
        // System.out.println("month: " + month + "  day: " + day + "  hour: " + hour + "  minute: " + min);

        // To print weekday or weekend 
        // System.out.print("Enter day: ");
        // int day = sc.nextInt();
        
        // Good Good
        // switch(day){
        //     case 1: {System.out.println("WEEKDAY");break;}
        //     case 2: {System.out.println("WEEKDAY");break;}
        //     case 3: {System.out.println("WEEKDAY");break;}
        //     case 4: {System.out.println("WEEKDAY");break;}
        //     case 5: {System.out.println("WEEKDAY");break;}
        //     case 6: {System.out.println("WEEKEND");break;}
        //     case 7: {System.out.println("WEEKEND");break;}
        //     default: {System.out.println("INVALD DAY");}
        // }

        // Hey i have seen this i have seen this , this is classical 
        // switch(day){
        //     case 1: {}
        //     case 2: {}
        //     case 3: {}
        //     case 4: {}
        //     case 5: {System.out.println("WEEKDAY");break;}
        //     case 6: {}
        //     case 7: {System.out.println("WEEKEND");break;}

        //     default: {System.out.println("INVALD DAY");}
        // }

        // Not bad Not bad the ultimate solution 
        // switch(day){
        //     case 1, 2, 3, 4, 5 : {System.out.println("WEEKDAY");break;}
        //     case 6, 7: {System.out.println("WEEKEND");break;}
        //     default : {System.out.println("INVALD DAY");}
        // }

        // Reverse a string 
        // String s = "abcde";
        // String rev = "";
        // for(int i = s.length() - 1; i >= 0; i--){
        //     rev += s.charAt(i);
        // }
        // System.out.println("Reverse String : "+rev);






        sc.close();
    }
}
