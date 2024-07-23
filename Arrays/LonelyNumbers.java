import java.util.ArrayList;
import java.util.Arrays;

public class LonelyNumbers {

    public static ArrayList<Integer> lonelynumbers(int[] arr)
    {
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++)
        {
            if (i==0)
            {
                if (arr[i]+1!=arr[i+1] && arr[i]+1 != arr[i]) {
                    list.add(arr[i]);
                }
            }
            else if (i==n-1)
            {
                if (arr[i]-1 != arr[i-1] && arr[i]-1 != arr[i]) {
                    list.add(arr[i]);
                }
            }
            else
            {
                if(arr[i]-1 != arr[i-1] && arr[i]+1 != arr[i+1] &&
                   arr[i]-1 != arr[i] && arr[i]+1 != arr[i])
                {
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {

        int[] arr = {10, 6, 5, 8};

        ArrayList<Integer> ans = lonelynumbers(arr);
        System.out.println(ans);

    }
}
