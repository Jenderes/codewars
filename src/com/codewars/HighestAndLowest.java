package com.codewars;

public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
    public static String HighAndLow(String numbers) {
        String[] parts = numbers.split(" ");
        int max = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[0]);
        for (int i = 1; i < parts.length; i++){
            if (max < Integer.parseInt(parts[i])){
                max = Integer.parseInt(parts[i]);
            }
            if (min > Integer.parseInt(parts[i])){
                min = Integer.parseInt(parts[i]);
            }
        }
        return max +" "+min;
    }

}
