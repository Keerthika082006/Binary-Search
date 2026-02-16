package BinarySearch1dArray;

import java.util.ArrayList;
import java.util.List;

public class medianOfGTwoArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2 = {5,6,7};
        System.out.println(fun(arr1,arr2));
    }
    static double fun(int[] arr1, int[] arr2){
        List<Integer> merge =new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int i=0;
        int j = 0;
        while(i<n&&j<m){
            if(arr1[i]<arr2[j]){
                merge.add(arr1[i]);
                i++;
            }
            else if(arr2[j]<arr1[i]){
                merge.add(arr2[j]);
                j++;
            }
            else{
                merge.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<n){
            merge.add(arr1[i]);
            i++;
        }
        while(j<m) {
            merge.add(arr2[j]);
            j++;
        }


        int len = merge.size();

        // If size is odd, return the middle element
        if (len % 2 == 1)
            return merge.get(len / 2);

        // If size is even, return the average of the two middle elements
        return (merge.get(len / 2 - 1) + merge.get(len / 2)) / 2.0;
    }

}
