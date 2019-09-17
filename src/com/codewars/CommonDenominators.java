package com.codewars;

public class CommonDenominators {
    public static void main(String[] args) {
        long[][] lst = new long[][] { {1, 2}, {1, 3}, {10, 40} };
        System.out.println(convertFrac(lst));
    }

    public static String convertFrac(long[][] lst) {
        if(lst.length==0) return "";
        long nod = lst[0][1];
        String Res = "";
        for (int i = 0; i < lst.length; i++){
            nod = FindNOK(nod,lst[i][1]);
        }
        for (int i = 0; i < lst.length; i++) {
            lst[i][0] = (nod/lst[i][1])*lst[i][0];
            lst[i][1] = nod;
            Res += "("+lst[i][0]+","+lst[i][1]+")";
        }
        return Res;
    }

    public static long FindNOD(long a, long b) {
        if (b == 0) return a;
        else return FindNOD(b, a % b);
    }
    public static long FindNOK(long a, long b) {
        return a * (b / FindNOD(a, b));
    }
    }