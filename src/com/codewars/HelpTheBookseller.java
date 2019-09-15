package com.codewars;
import java.util.*;
import java.util.regex.*;
public class HelpTheBookseller {
    public static void main(String[] args) {
        String art[] = new String[]{"BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B","C","D"};
        System.out.println(stockSummary(art,cd));
    }
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOf1stLetter.length == 0 || lstOfArt.length == 0){
            return "";
        }
        System.out.println(Arrays.toString(lstOfArt));
        System.out.println(Arrays.toString(lstOf1stLetter));
        Pattern pattern = Pattern.compile("\\s");
        int[] ArraySter = new int[lstOfArt.length];
        int[] ArrayLetter = new int[lstOf1stLetter.length];
        for (int i = 0; i< lstOfArt.length; i++){
            String[] strings = pattern.split(lstOfArt[i]);
            ArraySter[i] = Integer.parseInt(strings[1]);
        }
        for (int i = 0; i < lstOf1stLetter.length; i++){
            for (int j = 0; j < lstOfArt.length; j++){
                if (lstOf1stLetter[i].charAt(0) == lstOfArt[j].charAt(0)){
                    ArrayLetter[i] += ArraySter[j];
                }
            }
        }
        String NetIt;
        int i = 0;
            NetIt = "("+lstOf1stLetter[i]+" : "+ArrayLetter[i]+")";
            i++;
        while (i < lstOf1stLetter.length) {
            NetIt += " - ("+lstOf1stLetter[i]+" : "+ArrayLetter[i]+")";
            i++;
        }
        return NetIt;
    }
}
