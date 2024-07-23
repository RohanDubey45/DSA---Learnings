public class operators{
    public static void main(String[] args) {

        // **** using bodmas always bracket calculation has first priority 
        // and then other operators 

        // pre & post increement operators
        // int a = 15;
        // int b = ++a;  // pre increement ++a
        // System.out.println(a);
        // System.out.println(b);

        // int a = 15;
        // int b = a++;  // post increement a++ 
        // System.out.println(a);
        // System.out.println(b);

        // pre & post decreement operators 
        // int a = 15;
        // int b = --a; // pre decreement --a
        // System.out.println(a);
        // System.out.println(b);

        // int a = 20;
        // int b = a--; // post decreement a--
        // System.out.println(a);
        // System.out.println(b);

        // System.out.println( (2>1) && (2<3) ); && both stmnt should be true 
        // System.out.println( (2<1) || (2<3) ); // || 1 stmnt should be true compulsory to return true
        // System.out.println( !(5>2) ); reverse false to true and true to false 

        // int x = 2, y = 5;

        // int exp1 = (x * y / x);  // 5
        // int exp2 = (x * (y / x)); // 4

        // System.out.print(exp1 + " , ");
        // System.out.print(exp2);

        // int x = 200, y = 50, z = 100;
        // if(x > y && y > z){
        //     System.out.println("Hello");
        // }
        // if(z > y && z < x){
        //     System.out.println("Java");
        // }
        // if((y+200) < x && (y+150) < z){
        //     System.out.println("Hello Java");
        // }

        // int x, y, z;
        // x = y = z = 2;
        // x += y;
        // y -= z;
        // z /= (x + y); 
        // z = z / (x+y);
        // System.out.println(x+ " " + y+" " + z);  // 4 , 0, 0


        // int x = 10, y = 5;

        // int exp1 = (y * (x / y + x / y));
        // int exp2 = (y * x / y + y * x / y);

        // System.out.println(exp1); // 20
        // System.out.println(exp2); // 20
        

        // some imp tips 
        // bracket operation first and then remaining precedence from left to right

        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        System.out.println(exp);










    }
}