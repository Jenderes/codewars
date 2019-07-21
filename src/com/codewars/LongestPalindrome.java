package com.codewars;
import java.util.*;
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println(new LongestPalindrome().PalindromLongest("aaa"));
    }
    public int PalindromLongest (String str){
        if (str.length() <= 1){
            return str.length();
        }
        char[] ArrayChar = str.toCharArray() ;
        String result = str.substring(0,1);
        for (int i = 0; i < ArrayChar.length-1; i++) {
            for (int j =  ArrayChar.length - 1; j >= i; j--) {
                if (IsPolydrome(ArrayChar, i,j) && j-i >= result.length()){
                    result = str.substring(i,j+1);
                }
            }
        }
        return result.length();
    }
    public boolean IsPolydrome(char[] chars, int first, int last){
        for (int i = 0; i < last-first; i++) {
            if (chars[first + i] != chars[last-i]){
                return false;
            }
        }
        return true;
    }

}
