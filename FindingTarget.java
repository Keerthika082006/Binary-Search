package BinarySearch1dArray;

public class FindingTarget {
    public static void main(String[] args) {
        int[] arr = {2,4,6,12,15,19,21,25};
        int target = 21;
        System.out.println(fun(arr,target));
    }
    static int fun(int[] arr, int target){
        int n = arr.length;

        int low = 0;
        int high = n-1;

        while(low<=high) {
            int mid = low + (high-low )/ 2;

            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high = mid-1;
            }

        }
        return -1;
    }
}
