package BinarySearch1dArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FloorandCeil {
    public static void main(String[] args) {
        int[] arr = {3,4,4,7,8,10};
        int x = 5;
        System.out.println(Arrays.toString(getFloorAndCeil(arr,x)));
    }
    static int findFloor(int[] arr, int x){
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid];     // Potential floor
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    static int findCeil(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = arr[mid];     // Potential ceil
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    static int[] getFloorAndCeil(int[] arr, int x) {
        int f = findFloor(arr, x);
        int c = findCeil(arr, x);
        return new int[]{f, c};
    }
    }
