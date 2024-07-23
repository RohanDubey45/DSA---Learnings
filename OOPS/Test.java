public class Test 
{

    // getters and setters 
    // this refers to the current object 
    public static void main(String[] args)
    {

        // Pen p = new Pen();
        // p.setColor("green");
        // p.setTip(6);
        // System.out.println(p.getColor());
        // System.out.println(p.getTip());


        Employee e1 = new Employee();
        e1.setName("akash");
        e1.setId(101);
        e1.setAge(21);
        e1.setSalary(15000);

        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e1.getId());
        System.out.println(e1.getSalary());
    }
}

class Pen
{

    private String color;
    private int tip;


    // Getters
    String getColor(){  // getters to get the color 
        return this.color;
    }

    int getTip(){      // getters to get the tip
        return this.tip;
    }


    // Setters 
    void setColor(String newColor){   // setters to set the color
        color = newColor;
    }
    void setTip(int newTip){        // setters to set the tip
        tip = newTip;
    }

}

class Employee
{
    private String name;
    private int id;
    private int age;
    private int salary;

    // getters
    String getName(){
        return this.name;
    }
    int getId(){
        return this.id;
    }
    int getAge(){
        return this.age;
    }
    int getSalary(){
        return this.salary;
    }

    // Setters - in setters we need to pass the arguments
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    
}


