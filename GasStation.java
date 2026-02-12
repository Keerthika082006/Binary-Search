package BinarySearch1dArray;

public class GasStation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        System.out.println(minimiseMaxDistance(arr,k));
    }
        // Method to calculate required number of gas stations
        public static  int numberOfGasStationsRequired(double dist, int[] arr) {
            int n = arr.length;
            int count = 0;

            for (int i = 1; i < n; i++) {
                int numberInBetween = (int) ((arr[i] - arr[i - 1]) / dist);
                if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
                    numberInBetween--;
                }
                count += numberInBetween; //total number of additional gas stations required
            }

            return count;  //total number of additional gas stations required
        }

        // Method to minimize the maximum distance between gas stations
        public static double minimiseMaxDistance(int[] arr, int k) {
            int n = arr.length;
            double low = 0, high = 0;

            for (int i = 0; i < n - 1; i++) {
                high = Math.max(high, arr[i + 1] - arr[i]);
            }

            double diff = 1e-6;

            while (high - low > diff) {
                double mid = (low + high) / 2.0;
                int count = numberOfGasStationsRequired(mid, arr);

                if (count > k) {
                    low = mid;
                } else {
                    high = mid;
                }
            }

            return high;
        }



}
