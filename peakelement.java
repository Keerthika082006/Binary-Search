package BinarySearch1dArray;

public class peakelement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(fun(arr));
    }
    static int fun(int[] arr){
    // Set left and right bounds
    int low = 0, high = arr.length - 1;

    // Binary search loop
        while (low < high) {
            // Find mid point
            int mid = (low + high) / 2;

            // If mid element is greater than next
            if (arr[mid] > arr[mid + 1]) {
                // Move to left half
                high = mid;
            } else {
                // Move to right half
                low = mid + 1;
            }
        }
        return low;
    }
}
