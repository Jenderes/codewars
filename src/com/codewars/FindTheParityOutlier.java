package com.codewars;
import java.util.*;
public class FindTheParityOutlier {
    public static void main(String[] args) {
        int[] ArrayInt = new int[] {2,6,8,-10,3};
        System.out.println(find(ArrayInt));
    }
    static int find(int[] integers) {
        int cheven = 0;
        int chodd = 0;
        for (int i = 0; i < integers.length; i++) {
            if ((integers[i] & 1) == 0) {
                cheven++;
            } else {
                chodd++;
            }
        }
        if (cheven < chodd){
            for (int i = 0; i < integers.length; i++){
                if (integers[i]%2 == 0){
                    return integers[i];
                }
            }
        } else {
            for (int i = 0; i < integers.length; i++){
                if (integers[i]%2 != 0){
                    return integers[i];
                }
            }
        }
        return 0;
    }
    public static int findTopAnswer(int[] integers) {
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;
        return Arrays.stream(integers).parallel().filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }
}
