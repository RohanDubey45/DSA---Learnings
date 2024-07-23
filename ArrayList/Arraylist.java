import java.util.*;

public class Arraylist {

    static void swap(ArrayList <Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {

        // creating an arraylist
        ArrayList <Integer> list = new ArrayList<>();

        // // adding elements in arraylist Tc = O(1)
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // list.add(5, 44); // Tc = O(n)
        // System.out.println(list);

        // printing the arraylist
        // System.out.println(list);

        // get the element at given index in arraylist Tc = O(1)
        // int element = list.get(3);
        // System.out.println(element);

        // or use this
        // System.out.println(list.get(4));

        // remove element from given index in arraylist Tc =  O(n)
        // list.remove(4);
        // System.out.println(list);

        // set element at given index 
        // list.set(4, 55);
        // System.out.println(list);

        // System.out.println(list.contains(55));  // Tc = O(n)

        // System.out.println(list.size()); // prints the size or length of list

        // iterating an arraylist
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i)+" ");
        // }

        // printing the elements of the arraylist in reverse
        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+" ");
        // }

        // Finding max element in list
        // list.add(67);

        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++){
        //     max = Math.max(max, list.get(i));
        // }
        // System.out.println(max);

        // swap in arraylist

        // int idx1 = 1;
        // int idx2 = 3;

        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // System.out.println(list);

        // Ascending order sorted Most optimized sort
        // Collections.sort(list);
        // System.out.println(list); 

        // Descending order
        // Collections.sort(list, Collections.reverseOrder()); //Comparator func - logic
        // System.out.println(list);

    }
}