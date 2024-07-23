public class swap {

    public static void swap_without_3rd_variable(int x, int y){
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x = "+x+" & y = "+y);
    }
    public static void main(String[] args) {
        int x = 6;
        int y = 7;
        swap_without_3rd_variable(x, y);
    }
}
