// public class OOPS{
//     public static void main(String[] args) {

//         // Pencil p1 = new Pencil(); // created object of pencil

//         // using methods 
//         // p1.setColor("Grey"); // set color
//         // p1.setTip(5);  
//         // p1.setBrand("Techno-tip");
//         // System.out.println(p1.color);
//         // System.out.println(p1.tip);
//         // System.out.println(p1.brand);


//         // directly we can set it 
//         // p1.color = "voilet";
//         // p1.tip = 8;
//         // p1.brand = "Cello";
//         // System.out.println(p1.color);
//         // System.out.println(p1.tip);
//         // System.out.println(p1.brand);


//         // Student s1 = new Student();
//         // using method :-
//         // s1.calcPercentage(85, 95, 89);
//         // s1.setName("justin");
//         // System.out.println(s1.percentage);
//         // System.out.println(s1.name);

//         // directly :-
//         // s1.percentage = 83;
//         // s1.name = "rohan";
//         // System.out.println(s1.percentage);
//         // System.out.println(s1.name);


//         BankAccount acc1 = new BankAccount();
//         acc1.username = "rohan";
//         System.out.println(acc1.username);
//         acc1.setPassword("justin");
//         System.out.println(acc1.getPswd());

//     }
// }

// class BankAccount{

//     public String username;
//     private String password;

//     String getPswd(){                    // getter for the password
//         return this.password;
//     }

//     void setPassword(String password){   // setter for the password
//         this.password = password;
//     }

// }
// class Pencil{

//     String color; 
//     int tip;
//     String brand;

//     // void setColor(String newColor){
//     //     color = newColor;
//     // }
//     // void setTip(int newTip){
//     //     tip = newTip;
//     // }
//     // void setBrand(String newBrand){
//     //     brand = newBrand;
//     // }

// }
// class Student {
//     int percentage;
//     String name;

//     void calcPercentage(int eng, int maths, int hindi){
//         percentage = (eng + maths + hindi)/3;
//     }

//     void setName(String newName){
//         name = newName;
//     }
// }
