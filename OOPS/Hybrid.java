public class Hybrid {
    public static void main(String[] args) {
        Human men = new Human();
        men.breathe();
        men.eat();
        men.walk();
        men.work();
    }
}
// Hybrid inheritance 
class Animal
{
    void eat(){
        System.out.println("eating..");
    }
    void breathe(){
        System.out.println("breathing");
    }
}
class Fish extends Animal
{
    void swim(){
        System.out.println("swims..");
    }
}
class Tuna extends Fish{
    void nutrients(){
        System.out.println("vitamin B-12, Iron, Potassium");
    }
}
class Shark extends Fish{
    void size(){
        System.out.println("max is upto 40ft in length");
    }
}

class Birds extends Animal
{
    void fly(){
        System.out.println("fly");
    }
}
class Peacock extends Birds{
    void dance(){
        System.out.println("dance peacock dance");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Dog extends Mammal{
    void bow(){
        System.out.println("boowww");
    }
}
class Cat extends Mammal{
    void meow(){
        System.out.println("meoww");
    }
}
class Human extends Mammal{
    void work(){
        System.out.println("human works..");
    }
}