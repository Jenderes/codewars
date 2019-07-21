package com.codewars;
import java.util.*;
import java.lang.String;
public class DirectionsReduction {
    public static void main(String[] args) {
        String[] Arras = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        System.out.println(new DirectionsReduction().dirReduc(Arras));
    }
    public static String[] dirReduc(String[] arr) {
        List<String> StringList = new ArrayList<>(Arrays.asList(arr));
        int i = 0;
        while(i < StringList.size()-1){
            if (StringList.get(i).toUpperCase().equals("NORTH") && StringList.get(i+1).toUpperCase().equals("SOUTH")){
                    StringList.remove(i);
                    StringList.remove(i);
                    i = 0;
            } else if (StringList.get(i).toUpperCase().equals("SOUTH") && StringList.get(i+1).toUpperCase().equals("NORTH")){
                    StringList.remove(i);
                    StringList.remove(i);
                    i = 0;
            } else if (StringList.get(i).toUpperCase().equals("EAST") && StringList.get(i+1).toUpperCase().equals("WEST")) {
                    StringList.remove(i);
                    StringList.remove(i);
                    i = 0;
            } else if (StringList.get(i).toUpperCase().equals("WEST") && StringList.get(i+1).toUpperCase().equals("EAST")){
                    StringList.remove(i);
                    StringList.remove(i);
                    i = 0;
            } else {
                i++;
            }
        }
        arr = StringList.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
