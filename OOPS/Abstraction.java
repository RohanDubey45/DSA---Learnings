public class Abstraction {
    public static void main(String[] args) {

        Songs s = new friend1();
        s.favSong();
        s.changeSong();

        // s.singer = "justin-beiber";
        // System.out.println(s.singer);
        
    }
}

//Example of an abstract class that has abstract and non-abstract methods 
abstract class Songs
{
    String singer; // data members

    // constructor
    Songs(){
        System.out.println("All time fav is intentions");
    }

    // non-abstract method 
    void changeSong(){
        System.out.println("playing new song..");
    }

    // abstract method so it does not have any implementation 
    abstract void favSong();

}

//Creating a Child class which inherits Abstract class  
class friend1 extends Songs
{
    void favSong(){
        System.out.println("Let-me-love-you");
    }
}

class friend2 extends Songs
{
    void favSong(){
        System.out.println("This feeling");
    }
}
