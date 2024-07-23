import java.util.ArrayList;
import java.util.Arrays;

public class Barray {
    
    public static boolean isBeautiful(int[] arr){

        if (arr.length == 0) return false;
        if (arr.length == 1) return true;

        int n = arr.length;
        int TotalSum = ((n) * (n+1))/2;
        int sum = 0;
        boolean isNotAscending = true;

        for(int i=0; i<n; i++){
            sum += arr[i];
            if ((i != n-1) && (arr[i] > arr[i+1])) {
                isNotAscending = false;
            }
        }

        return !isNotAscending && TotalSum == sum;
    }

    // It will print beautiful array for size n
    public static ArrayList<Integer> beautifulArray(int n){

        if(n == 1) return new ArrayList<>(Arrays.asList(1));

        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);

        while (res.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();

            // Odd elements case
            for (int i = 0; i < res.size(); i++) {
                if ((res.get(i) * 2) - 1 <= n) {
                    temp.add((res.get(i) * 2) - 1);
                }
            }

            // Even elements case
            for (int i = 0; i < res.size(); i++) {
                if (res.get(i) * 2 <= n) {
                    temp.add(res.get(i) * 2);
                }
            }

            res = temp;
        }

        return res;
    }
    public static void main(String[] args) {
        // int[] arr = {};
        // System.out.println(isBeautiful(arr));


        int n = 5;
        ArrayList<Integer> ans = beautifulArray(n);
        System.out.println(ans);
    }
}
