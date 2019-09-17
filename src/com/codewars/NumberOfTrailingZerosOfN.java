package com.codewars;

public class NumberOfTrailingZerosOfN {
    public static void main(String[] args) {
        System.out.println(zeros(14));
    }
    public static int zeros(int n) {
        int zst = 5;
        int schtk = 0;
        if (( n/5) >= 1){
            while(n/zst != 0){
                schtk += n/zst;
                zst *= 5;
            }
            return schtk;
        } else {
            return 0;
        }
    }
}
