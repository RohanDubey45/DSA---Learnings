public class Test {

    public static int Factorial(int n){
        int fac = 1;
        for(int i = 1; i <= n; i++){
            fac *= i;
        }
        return fac;
    }

    public static int calBNC(int n, int r){
        int n_fac = Factorial(n);
        int r_fac = Factorial(r);
        int nr_fac = Factorial(n - r);
        return n_fac / (r_fac * nr_fac);
    }


    public static void main(String[] args) {
        // int ans = Factorial(6);
        // System.out.println("Factorial is : "+ans); or
        // System.out.println(calFac(7));

        int ans = calBNC(5, 2);
        System.out.println(ans);

    }
}
