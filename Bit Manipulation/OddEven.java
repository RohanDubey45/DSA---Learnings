public class OddEven {

    public static void Odd_or_Even(int n){
        int bitmask = 1; 

        if ((n&bitmask) == 0) {
            // even case lsb is 0
            System.out.println("EVEN");
        }
        else{
            // odd case lsb is 1
            System.out.println("ODD");
        }
    }

    public static int get_ith_bit(int n, int i){
        int bitmask = 1<<i; 

        if ((n&bitmask) == 0) {
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int set_ith_bit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static int clear_ith_bit(int n, int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static int update_ith_bit(int n, int i , int bit){
        if (bit==1) {
            return set_ith_bit(n, i); // if bit is 1 then we need to set it
        }
        else{
            return clear_ith_bit(n, i); // if bit is 0 then we need to clear it
        }
    }

    public static int clear_last_ith_bits(int n, int i){
        int bitmask = -1<<i;
        return n&bitmask;
    }
    public static boolean isPowerofTwo(int n){
        if(n<=0) return false;
        return (n&(n-1))==0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while (n != 0) {
            if((n&1)==1){
                count++;
            }
            // count += n&1;
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {

        // Odd_or_Even(52);
        // Odd_or_Even(6);

        // int ans = clear_ith_bit(10, 1);
        // System.out.println(ans);

        System.out.println(update_ith_bit(10, 1, 0));
        // System.out.println(clear_last_ith_bits(15 , 2));
        // System.out.println(isPowerofTwo(8));

        // System.out.println(countSetBits(3));
        
    }
}