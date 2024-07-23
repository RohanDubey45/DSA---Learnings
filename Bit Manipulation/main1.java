public class main1 {
    
    public static int fastExpo(int x , int n){
        if (n<0) {
            n = -n;
            x = 1/x;
        }
        int ans = 1;
        while (n > 0) {
            if ((n&1)==1) {
                ans *= x;
            }
            n = n>>1;
            x = x*x;
        }
        return ans;
    }
    public static void main(String[] args) {
       System.out.println(fastExpo(2, 4));
    }
}
