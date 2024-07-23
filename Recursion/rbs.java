public class rbs {

    public static int search(int[] arr, int target, int start, int end){

        if (start > end) return -1;

        int mid = start + (end-start)/2;

        if (arr[mid] == target) {
            return mid;
        }

        // mid on line l1
        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && target <= arr[mid]) {
                return search(arr, target, start, mid-1);
            }
            else{
                return search(arr, target, mid+1, end);
            }
        }

        // mid on line l2
        else{
            if (arr[mid] <= target && target <= arr[end]) {
                return search(arr, target, mid+1, end);
            }
            else{
                return search(arr, target, start, mid-1);
            }
        }
    }

    public static void main(String[] args) {

        // int[] arr = {4, 5, 6, 7, 0, 1, 2};
        // int[] arr = {5,6,0,1,2};
        // int target = 2;

        // int ans = search(arr, target, 0, arr.length-1);
        // System.out.println(ans);

        
    }
    
}
