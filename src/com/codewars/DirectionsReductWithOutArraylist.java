package com.codewars;
import java.util.Arrays;

public class DirectionsReductWithOutArraylist {
    public static void main(String[] args) {
        String[] Arras = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        System.out.println(new DirectionsReductWithOutArraylist().dirReducWithOut(Arras));
}
    public static String[] dirReducWithOut(String[] arr) {
        int i = 0;
        while(i < arr.length-1){
            if (arr[i].toUpperCase().equals("NORTH") && arr[i+1].toUpperCase().equals("SOUTH")){
                arr = RemoveElement(arr,i);
                arr = RemoveElement(arr,i);
                i = 0;
            } else if (arr[i].toUpperCase().equals("SOUTH") && arr[i+1].toUpperCase().equals("NORTH")){
                arr = RemoveElement(arr,i);
                arr = RemoveElement(arr,i);
                i = 0;
            } else if (arr[i].toUpperCase().equals("EAST") && arr[i+1].toUpperCase().equals("WEST")) {
                arr = RemoveElement(arr,i);
                arr = RemoveElement(arr,i);
                i = 0;
            } else if (arr[i].toUpperCase().equals("WEST") && arr[i+1].toUpperCase().equals("EAST")){
                arr = RemoveElement(arr,i);
                arr = RemoveElement(arr,i);
                i = 0;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static String[] RemoveElement(String[] arr, int elemdel) {
        String[] NewArray = new String[arr.length - 1];
        int k = 0;
        for (int i = 0; i < arr.length; i++ ) {
            if (elemdel != i){
                NewArray[k] = arr[i];
                k++;
            }
        }
        return NewArray;
    }

}
