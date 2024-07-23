public class Armstrong {
    public static void main(String[] args) {
        int num = 370;
        String str = Integer.toString(num);
        int len = str.length();
        int temp = num;
        int ans = 0;
        
        while (num > 0) {
            int remainder = num % 10;
            ans = (int)(ans + Math.pow(remainder, len));
            num /= 10;
        }
        if (temp == ans) {
            System.out.println("NOT ARMSTRONG");
        }
        else{
            System.out.println("ARMSTRONG");
        }
    }
}
