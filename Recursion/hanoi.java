public class hanoi {

    public static void toh(char src, char dest, char aux, int n){

        //int total = 3; // (total-n+1) // total towers for the problem when numbering is different

        // if there are 0 towers or disks then simply return
        if (n == 0) return;

        // move n-1 towers from src to aux using destination as helper
        toh(src, aux, dest, n-1);

        // printing of towers or disks from source to destination 
        System.out.println(n+". move from "+src+ " to " +dest);

        // move the n-1 towers from aux to destination using source as helper
        toh(aux, dest, src, n-1);

    }

    // problem - move all x to the end
    public static void print(String str, int i, String ns, int count){

        if (i == str.length()) {
            for(int k = 0; k <= count; k++){
                ns+="x";
            }
            System.out.println(ns);
            return;
        }

        char ch = str.charAt(i);

        if (ch != 'x') {
            ns += str.charAt(i);
            print(str, i+1, ns, count);
        }
        else{
            count++;
            print(str, i+1, ns, count);
        }
        
    }
    public static void main(String[] args) {

        // calling our tower of hanoi function
        // toh('A','C','B', 3);

        // String str = "axxbxxc";
        // print(str, 0, "", 0);

        // int i , j, k = 0;
        // // System.out.println(i);
        // // System.out.println(j);
        // System.out.println(k);

    }
}
