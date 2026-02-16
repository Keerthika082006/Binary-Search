package BinarySearch1dArray;

public class LowerBoundBrute {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int x = 8;
        System.out.println(fun(arr,x));
    }
    static int fun(int[] arr, int x){
        int n = arr.length;
        for(int i = 0; i<n;i++){
            if(arr[i]>=x){
                return i;
            }
        }
        return n;
    }
}
