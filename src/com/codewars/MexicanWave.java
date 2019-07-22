package com.codewars;
import java.util.Arrays;
public class MexicanWave {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(wave("one two three")));
    }
    public static String[] wave(String str) {
        String strnospace =  str.replaceAll("\\s", "");
        String[] Arraystr = new String[strnospace.length()];
        char[] CharArray = str.toCharArray();
        int k = 0;
        for (int i = 0; i < CharArray.length; i++) {
            if (CharArray[i] != ' '){
                CharArray[i] = Character.toUpperCase(CharArray[i]);
                Arraystr[k] = new String(CharArray);
                CharArray[i] = Character.toLowerCase(CharArray[i]);
                k++;
            }
        }
        return Arraystr;
    }
}
