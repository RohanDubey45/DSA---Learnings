import java.util.ArrayList;
import java.util.Arrays;

public class lonely {

    public static ArrayList<Integer> lonelyNumbers(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        // Taking the length of array in variable n
        int n = arr.length;

        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // Taking boolean var isLonely 
        boolean isLonely;

        // Traverse the array
        for(int i=0; i<n; i++)
        {
            if (i==0) 
            {
                if (arr[i]==arr[i+1] || arr[i]+1==arr[i+1])
                {
                    isLonely = false;
                }
            }
            else if (arr[i]==arr[i-1] || arr[i]==arr[i+1] || arr[i]-1==arr[i-1] || arr[i]+1==arr[i+1]) 
            {
                isLonely = false;
            }
            else if(i==n-1)
            {
                if (arr[i]== arr[i-1] || arr[i]-1==arr[i-1]){
                    isLonely = false;
                }
            }
            else{
                isLonely = true;
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3};
        ArrayList<Integer> ans = lonelyNumbers(arr);
        System.out.println(ans);  // Expected output: [1, 5]
    }
}
