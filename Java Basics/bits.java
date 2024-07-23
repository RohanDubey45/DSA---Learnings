public class bits {

    public static int Dec_To_Bin(int n){
        int power = 0;
        int Bin_Num = 0;
        int rem;

        while (n > 0) {
            rem = n % 2;
            Bin_Num = Bin_Num + rem * (int)Math.pow(10, power);
            power++;
            n /= 2;
        }
        return Bin_Num;
    
    }

    // public static boolean isEven(int n){
    //     if (n % 2 == 0) {
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }

    // }

    // public static boolean chechPalindrome(int n){
    //     int temp = n;
    //     int rev = 0;
    //     int rem;
    //     while (n > 0) {
    //         rem = n % 10;
    //         rev = rev * 10 + rem;
    //         n /= 10;
    //     }
    //     if (rev == temp) {
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }

    // }

    public static int sum_of__digits(int n){
        int sum = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        // int num = 1111011011;
        // int ans = 0;
        // int power = 0;
        // while (num > 0) {
        //     int rem = num % 10;
        //     if (rem == 0) {
        //         num /= 10;
        //         power++;
        //     }
        //     else{
        //         ans = (int)(ans + Math.pow(2, power));
        //         power++;
        //         num /= 10;
        //     }
        // }
        // System.out.println(ans);

        // int binary_num = 101;
        // int dec = 0;
        // int power = 0;
        // int rem;

        // while (binary_num > 0) {
        //     rem = binary_num % 10;
        //     dec = dec + ( rem * (int) Math.pow(2, power) );
        //     power++;
        //     binary_num /= 10;
        // }
        // System.out.println(dec);


        // int ans = Dec_To_Bin(7);
        // System.out.println(ans);

        // System.out.println(isEven(10));

        // int n = 1234;
        // int sum = 0;
        // int rem;
        // while (n > 0) {
        //     rem = n % 10;
        //     sum = sum + rem;
        //     n /= 10;
        // }
        // System.out.println(sum);
       
        // System.out.println(chechPalindrome(9));

        // int ans = sum_of__digits(1234);
        // System.out.println(ans);

        int a = 5;
        int b = 10;

        swap(a, b);

        // System.out.println(a);  // 5
        // System.out.println(b);  // 10

    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

}
