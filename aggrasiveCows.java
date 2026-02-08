package BinarySearch1dArray;

public class aggrasiveCows {
    public static void main(String[] args) {
        int[] stall = {0,3,4,7,9,10};
        int cows = 4;
        System.out.println(aggCow(stall,cows));
    }
    static boolean canPlace(int[] stall,int cows,int d){
        int count=1;
        int LastPos=stall[0];

        for(int i =1;i<stall.length;i++){
            if(stall[i]-LastPos>=d){
                count++;
                LastPos=stall[i];
            }
            if(count>=cows) return true;
        }
        return false;
    }

    static int aggCow(int[] stall,int cows){
        int low = 1;
        int high = stall[stall.length-1]-stall[0];
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canPlace(stall,cows,mid)){
                ans = mid;
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}
