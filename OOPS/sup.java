public class sup {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}

// super keyword with variables and methods / functions
class Vehicle { 
    int maxSpeed = 120; 

    void speed(){
        System.out.println("Speed limit is 120");
    }

} 
  
// sub class Car extending vehicle 
class Car extends Vehicle { 
    int maxSpeed = 180; 

    void speed(){
        System.out.println("Speed limit is 180");
    }
  
    void display() 
    { 
        // print maxSpeed of base class (vehicle) 
        // System.out.println("Maximum Speed: "+ super.maxSpeed); 

        speed(); // it will invoke current class speed() method/function

        super.speed(); // it will invoke base class speed() method/function
    } 
}
