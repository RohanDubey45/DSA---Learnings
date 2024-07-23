public class grid {

    public static int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int gridWays(int n , int m){

        int ways1 = (n-1) + (m-1);
        int ways2 = factorial(n-1) * factorial(m-1);

        int ans = factorial(ways1) / ways2;

        return ans; 
    }
    public static void main(String[] args) {
        int n = 10; 
        int m = 10;
        System.out.println(gridWays(n, m));
    }
}
