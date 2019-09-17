package com.codewars;
import java.util.*;
public class IntegersRecreationOne {
    public static void main(String[] args) {
        System.out.println(listSquared(42, 250));
    }
    public static String listSquared(long m, long n) {
        if (m > n){
            return "";
        }
        List<String> SumArr = new ArrayList<String>();
        for (long i = m; i <= n ; i++){
            long sum = 0;
            for (long j = 1; j <= i ; j++)
            if (i%j == 0){
                sum += j*j;
            }
            double dsum = (double)sum;
            if (Math.sqrt(dsum)%1 == 0){
                SumArr.add("["+i+", "+sum+"]");
            }
        }
        if (SumArr.size() == 0){
            return "";
        }
        String str = "["+ SumArr.get(0);
        for (int i = 1; i < SumArr.size(); i++){
            str += ", "+SumArr.get(i);
        }
        str += "]";
        return str;
    }
}
