// public class Test2
// {
//     public static void main(String[] args)
//     {
//         // Student s1 = new Student("raj", 46);

//         // System.out.println(s.name);
//         // System.out.println(s.roll);
//         // s.display();
        
//         // Student s2 = new Student("rohan", 45);

//         int[] marks = {45, 55, 65};
//         Student s3 = new Student("om", 46, 20, marks);
        
        
//         Student s4 = new Student(s3);
//         // s3.name= "justin"; // strings are immutable so for s3 - justin & for s4 - om
//         // s3.age = 21;  // primitive datatype no change occur
        
//         s3.marks[0] = 75;
//         // s3.display();
//         // s4.display();
//         for(int i=0; i<marks.length; i++){
//             System.out.print(s3.marks[i]+" ");
//         }
        
//     }

// }
// class Student
// {
//     String name;
//     int roll;
//     int age;
//     int marks[] = new int[3];

//     // parameterized constructors
//     Student(String name, int roll){
//         this.name = name;
//         this.roll = roll;
//     }

//     Student(String name, int roll, int age, int[] marks){
//         this.name = name;
//         this.roll = roll;
//         this.age = age;
//         this.marks = marks;

//     }

//     // copy constructor where s4 is copy of student s3 means all values of s3 are copied in s4
//     // also this is a shallow copy means any change you do in s4 or s3 will reflect even after they are copied in the past
//     // Student(Student s3){
//     //     this.name = s3.name;
//     //     this.roll = s3.roll;
//     //     this.age = s3.age;
//     //     this.marks = s3.marks;
//     // }

//     // deep copy
//     Student(Student s3){
//         this.name = s3.name;
//         this.roll = s3.roll;
//         this.age = s3.age;
//         for(int i=0; i<marks.length; i++){
//             this.marks[i] = s3.marks[i];
//         }
//     }
    

//     void display(){
//         System.out.println("name: "+name+" "+ " roll: "+roll+" "+" age: "+age);
//         // for(int i=0; i<marks.length; i++){
//         //     System.out.print(marks[i]+" ");
//         // }
//         // System.out.println();
//     }

// }