public class PivotTarget {

    public static int Pivot(int arr[]){
        
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start+(end-start)/2;

            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid+1;
            }
            else if (mid > start && arr[mid] < arr[mid-1]) {
                return mid;
            }
            else if (arr[start] > arr[mid]) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return 0;

    }

    public static int BinarySearch(int arr[], int target, int start, int end){
        
        while (start<=end) {
            int mid = start+(end-start)/2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (target<arr[mid]) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static int search(int arr[], int target){
        
        int array_pivot = Pivot(arr);

        if (array_pivot == 0) {
            return BinarySearch(arr, target, 0, arr.length-1);
        }

        int ans = BinarySearch(arr, target, 0, array_pivot-1);

        if (ans == -1) {
            ans = BinarySearch(arr, target, array_pivot, arr.length-1);
        }

        return ans;

    }
    public static void main(String[] args) {

        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 7;

        int ans = search(arr, target);
        System.out.println(ans);

        
    }
}
