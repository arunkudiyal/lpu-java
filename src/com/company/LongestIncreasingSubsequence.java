package com.company;

import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static int lis(int n, int[] arr) {
        int[] output = new int[n];
        for(int i=0; i < n; i++)
            output[i] = 1;

        for(int i=1; i < n; i++) {
            for(int j=i-1; j >= 0; j--) {
                // If the sequence is decreasing, so I will skip
                if(arr[i] < arr[j])
                    continue;

                // if the sequence is increasing, so I will find the LIS
                int possibleAns = output[j] + 1;
                if(possibleAns > output[i])
                    output[i] = possibleAns;
            }
        }
        // Finding the max increasing output length
        int max = 1;
        for(int i=0; i < n; i++) {
            if(max < output[i])
                max = output[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();

        int answer = lis(n, arr);

        System.out.println(answer);
    }
}
