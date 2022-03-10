package com.company;


public class randomNumbers {
    public static void generator(int n) {
        long a = 1664525, b = 1013904223;
        int m = 7;
        long seed = System.currentTimeMillis();
        m = (int) Math.pow(2, 32);
        long arr[] = new long[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = (a * seed + b) % m;
            seed += 1;
            System.out.println(arr[i]);
        }
    }
}