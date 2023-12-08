package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int N = 5;
        //int arr[] = {2, 4, 6, 8, 12};
        int arr[] = {1, 5, 7};

        int minimumPositiveNumber = findPrimeNumber(Arrays.stream(arr).sum()) - Arrays.stream(arr).sum();
        System.out.println("minimumPositiveNumber" + minimumPositiveNumber);
    }

    private static int findPrimeNumber(int i) {
        boolean isprime = false;
        int q = i;
        for (int j = 2; j <= q / 2; j++) {
            if (q % j == 0) {
                q++;
                j = 2;
            } else {
                isprime = true;
            }
        }

        if (isprime) {
            return q;
        }
        return 0;
    }

}