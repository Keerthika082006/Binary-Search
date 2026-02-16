package BinarySearch1dArray;

public class HowManyTimesRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        System.out.println(fun(arr));
    }
    static int fun(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }}
            return low;
        }
    }
