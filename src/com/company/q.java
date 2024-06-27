package com.company;

import java.util.ArrayList;
import java.util.List;

public class q {

    public static int killAnthill(int arr[], int t){
        int totalTime = 0;
        int totalAntsKilled = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int timeToKill = i + 1;
            while (arr[i] > 0 && totalTime + timeToKill <= t) {
                totalTime += timeToKill;
                totalAntsKilled += arr[i];
                arr[i] = 0; // All ants at this index killed
            }
        }
        return totalAntsKilled;
    }
    public static void main(String[] args) {
        int[] arr = {305, 779, 185};
        int t = 2;
        System.out.println(killAnthill(arr, t));
    }
}
