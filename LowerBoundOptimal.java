package BinarySearch1dArray;

public class LowerBoundOptimal {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int x = 9;
        System.out.println(fun(arr,x));
    }
    static int fun(int[] arr, int x){
        int n  = arr.length;
        int low = 0;
        int high = n-1;
        int ans = n;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
