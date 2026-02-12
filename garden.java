package BinarySearch1dArray;

import java.util.Arrays;

public class garden {
    // Function to check if it's possible to make 'm' bouquets on 'day'
    public boolean isPossible(int[] bloomDays, int day, int m, int k) {
        int count = 0;  // count of consecutive bloomed flowers
        int bouquets = 0;

        for (int bloom : bloomDays) {
            if (bloom <= day) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return bouquets >= m;
    }

    // Main function to return minimum day to make 'm' bouquets
    public int minDaysToMakeBouquets(int[] bloomDays, int m, int k) {
        long totalFlowers = (long) m * k;
        if (totalFlowers > bloomDays.length) return -1;

        int min = Arrays.stream(bloomDays).min().getAsInt();
        int max = Arrays.stream(bloomDays).max().getAsInt();

        for (int day = min; day <= max; day++) {
            if (isPossible(bloomDays, day, m, k)) {
                return day;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] bloomDays = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;

        garden garden = new garden();
        int result = garden.minDaysToMakeBouquets(bloomDays, m, k);

        if (result == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + result);
    }
}

