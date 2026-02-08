package BinarySearch1dArray;


public class bookallocation {

    public static void main(String[] args) {
        int[] arr = {25, 46, 28, 49, 24};
        int n = arr.length;
        int m = 4;

        System.out.println("The answer is: " + findPages(arr, n, m));
    }

        public static int countStudents(int[] arr, int pages) {
            int students = 1;
            int pagesStudent = 0;

            for (int i = 0; i < arr.length; i++) {
                if (pagesStudent + arr[i] <= pages) {
                    pagesStudent += arr[i];
                } else {
                    students++;
                    pagesStudent = arr[i];
                }
            }
            return students;
        }

        public static int findPages(int[] arr, int n, int m) {

            if (m > n) return -1;

            int low = Integer.MIN_VALUE;
            int high = 0;

            for (int pages : arr) {
                low = Math.max(low, pages);
                high += pages;
            }

            while (low <= high) {
                int mid = low + (high - low) / 2;
                int students = countStudents(arr, mid);

                if (students > m) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            return low;
        }

    }

