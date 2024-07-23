public class Test {

    public static void printInc(int n)
    {
        if (n==1) {
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");

    }

    public static void allOccurences(int[] arr, int index, int key)
    {
        // if we traversed whole array and reach it's length then return
        if (index == arr.length) return;

        if (arr[index] == key) 
            System.out.print(index+" ");

        allOccurences(arr, index+1, key);
    }

    public static int fibonacci(int n)
    {
        if (n == 0 || n == 1) return n;
        int ans = fibonacci(n-1) + fibonacci(n-2);
        return ans;
    }

    public static int friendsPairing(int n)
    {
        if (n==1 || n==2) {
            return n;
        }
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    // print all binary strings for n length without consecutive 1s
    // public static void printBinaryStrings(int n, String str, int prevIndex)
    // {
    //     // base case 
    //     if (n == 0) {
    //         System.out.println(str);  
    //         return;
    //     }
    //     // work
    //     printBinaryStrings(n-1, str+"0", 0);

    //     if (prevIndex == 0) {
    //         printBinaryStrings(n-1, str+"1", 1);
    //     }
    // }

    // print all binary strings for n length without consecutive 1s
    public static void binaryStrings2(int n, String str, int lastplace){

        if (n == 0) {
            System.out.println(str);
            return;
        }

        // work
        binaryStrings2(n-1, str+"1", 1);

        if (lastplace == 1) {
            binaryStrings2(n-1, str+"0", 0);
        }

    }
    public static void main(String[] args) {


        // int n = 10;
        // printInc(n);

        // int[] arr = {1, 2, 2, 1, 3, 5, 1, 7, 1};
        // int index = 0;
        // int key = 1;
        // allOccurences(arr, index, key);

        // System.out.println(fibonacci(6));

        // System.out.println(friendsPairing(5));

        // printBinaryStrings(2, 0, "");
        // System.out.println("power is : "+power(5, 3));

        // String str = "rrroooohhhannn";
        // System.out.println("without removing duplicates: "+str);

        // System.out.print("with removing duplicates: ");
        // removeDuplicates(str, new StringBuilder(""), 0, new boolean[26]);

        // printBinaryStrings(4, "", 0);

        // binaryStrings2(4, "", 1);

        // String str = "abcde";
        // System.out.println(length(str));

        printStringDigits(2003);

    }

    // public static int length(String str){
    //     if (str.length() == 0) {
    //         return 0;
    //     }
    //     return length(str.substring(1)) + 1;
    // }

    // public static int power(int x, int n){
    //     if (n==1) return x;
    //     int prePow = power(x, n-1);
    //     int ans = x * prePow;
    //     return ans;
    // }

    // public static int optimizePower(int a, int n){
    //     // base case
    //     if (n == 0) return 1;
    //     int halfPower = optimizePower(a, n/2);
    //     int halfPowersq = halfPower * halfPower;
    //     if (n % 2 != 0) halfPowersq = a * halfPowersq;
    //     return halfPowersq;
    // }

    // public static void removeDuplicates(String str, StringBuilder ns, int i, boolean[] track){
    //     // base case if we reach the length of the string then we will print the ns and return
    //     if (i == str.length()) {
    //         System.out.println(ns);  // ns is the newString built without duplicate values
    //         return;
    //     }
    //     // taking the current char of string using index i
    //     char currChar = str.charAt(i);
    //     // if currChar is a duplicate then we will not append that currchar and go to next char
    //     // where track[currChar-'a'] gives the index position for the current character
    //     if (track[currChar-'a'] == true) {
    //         removeDuplicates(str, ns, i+1, track);
    //     }
    //     // if currChar is not a duplicate then we will mark true at that index of our boolean trak array and go to next char
    //     else{
    //         track[currChar-'a'] = true;
    //         removeDuplicates(str, ns.append(currChar), i+1, track);
    //     }
    // }

    public static void printStringDigits(int n){

        String[] digits = {"zero", "one", "two", "three", "four", 
                           "five", "six", "seven", "eight", "nine"};

        if (n == 0) {
            return;
        }

        int lastDigit = n % 10;
        printStringDigits(n/10);
        System.out.print(digits[lastDigit]+" ");
    }
    
}
