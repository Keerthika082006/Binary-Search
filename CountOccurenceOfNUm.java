package BinarySearch1dArray;

public class CountOccurenceOfNUm {
    public static void main(String[] args) {
        int[] arr =  {1, 3, 5, 7};
        int n = 4, x = 8;
        int ans = count(arr, n, x);
        System.out.println( ans);
    }
        public static int first(int[] arr, int n, int k) {
            int low = 0, high = n - 1;
            int first = -1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid] == k) {
                    first = mid;
                    high = mid - 1;
                } else if (arr[mid] < k) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return first;
        }

        public static int last(int[] arr, int n, int k) {
            int low = 0, high = n - 1;
            int last = -1;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == k) {
                    last = mid;
                    low = mid + 1;
                } else if (arr[mid] < k) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return last;
        }

        public static int[] firstAndLastPosition(int[] arr, int n, int k) {
            int first = first(arr, n, k);
            if (first == -1) return new int[] { -1, -1};
            int last = last(arr, n, k);
            return new int[] {first, last};
        }

        public static int count(int arr[], int n, int x) {
            int[] ans = firstAndLastPosition(arr, n, x);
            if (ans[0] == -1) return 0;
            return (ans[1] - ans[0] + 1);
        }


    }
