package com.codewars;
import java.math.*;

public class CountOnesNaSegment {
    public static void main(String[] args) {
    }
    public static BigInteger countOnes(long left, long right) {
        return countOnes(right).subtract(countOnes(left-1));
    }
    public static BigInteger countOnes(long right){
        if (right==0){
            return BigInteger.valueOf(0);
        }
        int size = (Long.toBinaryString(right).length()) - 1;
        long power = (long) 1 << size;
        return BigInteger.valueOf(size).multiply(BigInteger.valueOf(power/2)).add(BigInteger.valueOf(1 + right - power)).add(countOnes(right-power)) ;
    }
}
