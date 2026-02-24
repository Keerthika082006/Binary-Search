package BinarySearch1dArray;

public class NthRootOfNum {
    public static void main(String[] args) {
        System.out.println(fun(3,8));
    }
    static int fun (int n,int m){
            // Loop from 1 to m
            for (int i = 1; i <= m; i++) {
                // Compute i^n
                long power = (long) Math.pow(i, n);

                // If equal to m, return i
                if (power == m) return i;

                // If exceeds m, break
                if (power > m) break;
            }

            // If not found, return -1
            return -1;
        }
    }

