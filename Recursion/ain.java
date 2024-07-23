public class ain {

    public static int print_sum(int[] arr, int i, int currentSum){
        // print sum of all elements in the array
        if (i==arr.length) {
            return currentSum;
        }
        currentSum+=arr[i];
        return print_sum(arr, i+1, currentSum);

    }

    public static void reverseString(String str, StringBuilder sb, int i){
        // reverse the string
        // base case
        if (i<0) {
            System.out.println(sb.toString());
            return;
        }
        reverseString(str, sb.append(str.charAt(i)), i-1);
        // work
        // char ch = str.charAt(i);
        // sb.append(ch);

    }

    public static int sum_of_digits(int num, int currentSum){
        // print sum of digits of a number
        // base case
        if (num == 0) {
            return currentSum;
        }
        // work 
        currentSum += num%10; 
        return sum_of_digits(num/10, currentSum);

    }

    public static void hailstone(int n){
        // printing the hailstone sequence
        if (n==1) {
            return;
        }

        if (n%2==0) {
            n /= 2;
            System.out.print(n+" ");
        }
        else{
            n = (3*n) + 1;
            System.out.print(n+" ");
        }
        hailstone(n);
    }

    public static void search(char[] arr, int i, char target){
        // find target in the character array
        if (i == arr.length) {
            System.out.println(-1);
            return;
        }
        if(arr[i] == target){
            System.out.println(i);
            return;
        }
        search(arr, i+1, target);
    }
    public static void main(String[] args) {
        
        // problem - sum of all elements in the array
        // int[] arr = {1, 2, 3, 6, 7, 1};
        // System.out.println(print_sum(arr, 0, 0));


        // problem - reverse the given string 
        // String str = "rohan";
        // StringBuilder sb = new StringBuilder("");
        // reverseString(str, sb, str.length()-1);

        // problem - sum of all digits in a number
        // int number = 6699;
        // System.out.println(sum_of_digits(number, 0));

        // problem - printing the hailstone sequence for a given number 
        // int n = 7;
        // System.out.print("Hailstone for "+n+" : "+n+" ");
        // hailstone(n);

        // problem - find target element in the array
        // char[] arr = {'a', 'b', 'c', 'e', 'f'};
        // char target = 'z';
        // search(arr, 0, target);

        // int[] arr = {7, 2, 9, 5, 4, 3, 1};
        // int[] ans =  mergeSort(arr, 0, arr.length-1);
        // printArray(ans);

        String[] str = {"sun", "earth", "mars", "mercury"};
        System.out.print("String before sorting: ");
        printArray(str);

        String[] ans = mergeSort(str, 0, str.length-1);
        System.out.print("String after sorting: ");
        printArray(ans);

        // System.out.println(sum(5));
    }

    public static int sum(int n){
        if (n==1) {
            return 1;
        }
        return n + sum(n-1);
    }

    

    // for sorting integer arrays
    // public static int[] mergeSort(int[] arr, int start, int end){

    //     // base case - where in the end only one element remains in the array
    //     if (start == end) {
    //         int[] res = new int[1];
    //         res[0] = arr[end];
    //         return res;
    //     }

    //     int mid = start + (end-start)/2;
    //     // work - it will sort the arrays in two left and right parts
    //     int[] left = mergeSort(arr, start, mid);
    //     int[] right = mergeSort(arr, mid+1, end);

    //     return mergeSortedArrays(left, right);

    // }

    // public static int[] mergeSortedArrays(int[] left, int[] right){

    //     int n = left.length;
    //     int m = right.length;

    //     int[] res = new int[n+m];

    //     int i = 0;
    //     int j = 0;
    //     int k = 0;

    //     while (i<n && j<m) {
    //         if (left[i] < right[j]) {
    //             res[k] = left[i];
    //             i++;
    //         }
    //         else{
    //             res[k] = right[j];
    //             j++;
    //         }
    //         k++;
    //     }

    //     while (i<n) {
    //         res[k] = left[i];
    //         i++;
    //         k++;
    //     }

    //     while (j<m) {
    //         res[k] = right[j];
    //         j++;
    //         k++;
    //     }

    //     return res;
    // }
    
    // for sorting string arrays
    public static String[] mergeSort(String[] arr, int start, int end){

        // base case - where in the end only one element remains in the array
        if (start == end) {
            String[] res = new String[1];
            res[0] = arr[end];
            return res;
        }

        int mid = start + (end-start)/2;
        // work - it will sort the arrays in two left and right parts
        String[] left = mergeSort(arr, start, mid);
        String[] right = mergeSort(arr, mid+1, end);

        return mergeSortedArrays(left, right);

    }

    public static String[] mergeSortedArrays(String[] left, String[] right){

        int n = left.length;
        int m = right.length;

        String[] res = new String[n+m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i<n && j<m) {
            if (left[i].compareTo(right[j]) < 0) {
                res[k] = left[i];
                i++;
            }
            else{
                res[k] = right[j];
                j++;
            }
            k++;
        }

        while (i<n) {
            res[k] = left[i];
            i++;
            k++;
        }

        while (j<m) {
            res[k] = right[j];
            j++;
            k++;
        }

        return res;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

