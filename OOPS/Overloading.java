public class Overloading {
    public static void main(String[] args) {

        // Calculator c = new Calculator();

        // System.out.println(c.sum(4, 5));
        // System.out.println(c.sum((float)1.5, (float)1.5));
        // System.out.println(c.sum(1,2,3));

        // Mehod overriding example
        // Ola_Scooty os = new Ola_Scooty();
        // os.food();
        
    }
}


// Compile-time polymorphism
// Method overloading
class Calculator
{
    int sum(int a, int  b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b+ c;
    }
    float sum(float a, float b){
        return a + b;
    }
}



// Run-time polymorphism
// Overriding
class Two_Wheeler{
    void food(){
        System.out.println("petrol");
    }
}
class Ola_Scooty extends Two_Wheeler{
    void food(){
        System.out.println("Electric");
    }
}
