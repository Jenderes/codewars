package com.codewars;

import java.util.Arrays;

public class LargestifferencenIncreasingIndexes {
    public static void main(String[] args) {
        System.out.println(largestDifference(new int[]{78, 88, 64, 94, 17, 91, 57, 69, 38, 62, 13, 17, 35, 15, 20}));
        System.out.println(largestDifferenceBestAnswer(new int[]{78, 88, 64, 94, 17, 91, 57, 69, 38, 62, 13, 17, 35, 15, 20}));
    }
    public static int largestDifference(int[] data) {
        System.out.println(Arrays.toString(data));
        int num = 0;
        for (int i = 0; i < data.length; i++){
            for (int j = i+1; j < data.length - i; j++){
                if (data[i] <= data[j]){
                    if (num < j-i){
                        if (num == 5) {
                            num = 10;
                        }
                        num = j-i;
                    }
                }
            }
        }
        return num;
    }
    public static int largestDifferenceBestAnswer(int[] data) {
        int largestDifference = 0;
        for(int i = 0; i < data.length; i++){
            for(int j = 1; j < data.length; j++){
                if(data[i] <= data[j] && (j - i) > largestDifference)
                    largestDifference = j - i;
            }
        }
        return largestDifference;
    }
}
