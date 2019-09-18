package com.codewars;

public class Scramblies {
    public static void main(String[] args) {
        System.out.println(scramble("scriptjavx","javascript"));
    }
    public static boolean scramble(String str1, String str2) {
        for (int i = 0; i < str2.length(); i++ ){
            for (int j = 0; j < str1.length(); j++){
                if(str1.charAt(j)== str2.charAt(i)){
                    str1 = removeCharAt(str1,j);
                    break;
                }
                if( j == str1.length() -1){
                    return false;
                }
            }
        }
        return true;
    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
