public class TypeCasting {

    public static void main(String[] args) {
        // compatible type conversion widening or explicit conversion
        // we can convert small to long data type 
        // int a = 25;
        // long b = a;
        // System.out.println(b);

        // Incompatible type conversion will give error
        // long a = 25;
        // int b = a;
        // System.out.println(b);


        // narrowing conversion or implicit conversion 
        // float mks = 99.9999f;
        // int a = (int) mks;
        // System.out.println(a);

        // int a = 98;
        // short s = (short) a;
        // System.out.println(s);

        // char ch = 'A';
        // char ch2 = 'a';

        // int num = ch;
        // int num2 = ch2;

        // System.out.println(num);
        // System.out.println(num2);

        // int num = 65;
        // char ch = (char)num; // will print capital A
        // System.out.println(ch);

        // char a = 'a';
        // char b = 'b';
        // System.out.println((int) a);
        // System.out.println((int) b);
        // System.out.println(b-a);

        // type conversion
        // byte short char it converts to int while calculating them
        // byte b = 2;
        // short s = 25;
        // char c = 'a';
        // byte ans = (byte) (b + s + c);
        // System.out.println(ans);

        // int i = 50;
        // float f = 3.44f;
        // long l = 5455;
        // double d = 45.56;

        // double ans = i + f + l + d;
        // System.out.println(ans);

        // this is for short or lesser data types 
        // byte b = 5;
        // byte a = b * 2; // will give error 
        // byte a = (byte) (b * 2);
        // System.out.println(a);


    }
}
