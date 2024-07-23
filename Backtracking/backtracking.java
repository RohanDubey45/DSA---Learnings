public class backtracking{

    // Array backtracking
    public static void changeArray(int[] arr, int i, int val){

        // base case
        if (i == arr.length) {
            printArray(arr);
            return;
        }

        // recursive work - we added elements at every index 
        arr[i] = val;
        changeArray(arr, i+1, val+1);

        // after recursion is completed for all levels then we will subtract 2 from every level
        // Imp... Backtracking step
        arr[i] -= 2;  

    }

    public static void  printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        changeArray(arr, 0, 1);
        printArray(arr);

    }
}