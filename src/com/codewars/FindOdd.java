package com.codewars;
import java.util.*;

public class FindOdd {
    public static void main(String args[]){
    int [] array = new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
    System.out.println(FindIntOdd(array));
    }
    public static int FindIntOdd(int[] a){
        int schk = 1;
        int numberchk = 0;
        for (int i = 0; i < a.length; i++){
            numberchk = a[i];
            for (int j = 0; j < a.length; j++){
                if ((i != j) && a[i] == a[j]){
                    schk +=1;
                }
            }
            if (schk%2 != 0){
                return numberchk;
            } else {
                schk = 1;
            }
        }
        return 0;
    }
public static int FindIntOddTopAnswer(int[] a){
    int xor = 0;
    for (int i = 0; i < a.length; i++) {
        xor ^= a[i];
    }
    return xor;
}
}
}