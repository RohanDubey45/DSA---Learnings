public class FunctionOverloading {

    // with different number of parameters 
    // public static int sum(int a , int b){
    //     return a + b;
    // }
    // public static int sum(int a , int b, int c){
    //     return a + b + c;
    // }

    // with different datatypes of parameters
    // public static int multiply(int a, int b){
    //     return a * b;
    // }
    // public static double multiply(double a, double b){
    //     return a * b;
    // }

        public static boolean checkPrime(int n){
            if (n <= 1) {
                return false;
            }
            else if (n == 2) {
                return true;
            }
            for(int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        
        public static void prime_in_range(int n){
            for(int i = 1; i <= n; i++){
                if (checkPrime(i)) {
                    System.out.print(i+" ");
                }
            }
        }
    public static void main(String[] args) {

        // System.out.println(sum(5, 3));
        // System.out.println(sum(5, 2, 1));

        // System.out.println(multiply(2, 1));
        // System.out.println(multiply(1.1, 2.1));

        // boolean ans = checkPrime(83);
        // System.out.println(ans);

        prime_in_range(100);



    }
}
