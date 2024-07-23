public class Inface {
    public static void main(String[] args) {

        // Wagonr wr = new Wagonr();
        // wr.tyres();
        // wr.engine();
        // wr.horsepower();

        // Dreamyuga dy = new Dreamyuga();
        // dy.tyres();
        // dy.engine();
        // dy.horsepower();

        // Drawable d = new Circle();
        // d.draw();

        // Bear b = new Bear();
        // b.eat2();

        Operation on = new Operation();
        System.out.println(on.add(5, 10));
        System.out.println(on.sub(15, 10));
    }
}

// It is used to achieve abstraction and multiple inheritance in Java. it is a blueprint of class
// interface vehicles{
//     abstract void tyres();
//     abstract void engine();
//     abstract void horsepower();
// }
// class Wagonr implements vehicles
// {
//     public void tyres(){
//         System.out.println("This car has total 4 tyres");
//     }
//     public void engine(){
//         System.out.println("Advance K-series engine with ISS");
//     }
//     public void horsepower(){
//         System.out.println("Horse power is 67 hp");
//     }
// }
// class Dreamyuga implements vehicles
// {
//     public void tyres(){
//         System.out.println("This bike has total 2 tyres");
//     }
//     public void engine(){
//         System.out.println("It has a engine of 110cc");
//     }
//     public void horsepower(){
//         System.out.println("Horse power is 8bhp");
//     }
// }

// Another example of interface in java
// interface Drawable
//{
//     abstract void draw();
// }
// class Circle implements Drawable
// {
//     public void draw(){
//         System.out.println("drawing a circle..");
//     }
// }
// class Rectangle implements Drawable
// {
//     public void draw(){
//         System.out.println("drawing a rectangle..");
//     }
// }


// multiple inheritance - where a class implements multiple interfaces 
// interface herbivore{
//     abstract void eat1();
// }
// interface carnivore{
//     abstract void eat2();
// }
// class Bear implements herbivore, carnivore{

//     Bear(){
//         System.out.println("Bear constructor invoked..");
//     }

//     public void eat1(){
//         System.out.println("Eats grass");
//     }
//     public void eat2(){
//         System.out.println("Eats animals");
//     }

// }

interface Add
{
    abstract int add(int a, int b);
    // default void msg(){
    //     System.out.println("It will add two numbers..");
    // }
}
interface Sub extends Add{
    abstract int sub(int a, int b);
}
class Operation implements Sub {

    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
}