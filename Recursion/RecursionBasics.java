public class RecursionBasics
{

    public static void printDec(int n)
    {
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);

    }
    public static void printInc(int n)
    {   if (n==1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        int fac_n = n * fact(n-1);
        return fac_n;

    }
    public static int sum(int n){
        if (n==1) return 1;
        int ans = n + sum(n-1);
        return ans;
    }

    public static int nthFibonacci(int n){
        if(n == 0 || n==1) return n;
        int ans = nthFibonacci(n-1) + nthFibonacci(n-2);
        return ans;
    }

    public static boolean isSorted(int[] arr, int i){
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int[] arr, int i, int target)
    {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return firstOccurence(arr, i+1, target);
    }

    // public static int lastOccurence(int[] arr, int i, int key)
    // {
    //     if (i<0)
    //     {
    //         return -1;
    //     }
    //     if (arr[i]==key)
    //     {
    //         return i;
    //     }
    //     return lastOccurence(arr, i-1, key);
    // }
    public static int lastOccurence(int[] arr, int i, int key)
    {
        if (i==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, i+1, key);
        if (isFound == -1 && arr[i]==key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n)
    {
        if (n==0) {
            return 1;
        }
        return x * power(x, n-1);
    }

    public static int optimizedPower(int x, int n)
    {
        if (n==0) return 1;
        int halfPower = optimizedPower(x, n/2);
        int ans = halfPower * halfPower;
        if (n%2 != 0 ) {
            ans = x * ans;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        // int n = 5;

        // printDec(n);

        // printInc(n);

    // System.out.println(fact(5));

        // System.out.println(sum(5));
        // System.out.println(nthFibonacci(26));

        // int[] arr = {1, 2, 2, 3, 3, 3, 5};
        // int[] arr1 = {8, 3, 6, 9, 5, 10, 2, 5, 3};

        // System.out.println(isSorted(arr, 0));


        // System.out.println(firstOccurence(arr1, 0, 3));

        // System.out.println(lastOccurence(arr1, arr1.length-1, 8));

        System.out.println(power(5, 5));
    }
}
