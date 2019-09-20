package com.codewars;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(distinctPermute("abcd"));
    }
    static boolean isPresent(String s, List<String> Res)
    {
        for (String str : Res) {
            if (str.equals(s))
                return true;
        }
        return false;
    }
    static List<String> distinctPermute(String str)
    {
        if (str.length() == 0) {
            ArrayList<String> baseRes = new ArrayList<>();
            baseRes.add("");
            return baseRes;
        }
        char ch = str.charAt(0);
        String restStr = str.substring(1);
        List<String> prevRes = distinctPermute(restStr);
        List<String> Res = new ArrayList<>();
        for (String s : prevRes) {
            for (int i = 0; i <= s.length(); i++) {
                String f = s.substring(0, i) + ch + s.substring(i);
                if (!isPresent(f, Res))
                    Res.add(f);
            }
        }
        return Res;
    }
    // top answer
    public static void generate(String seq, String out, List<String> list){
        if (seq.isEmpty()){
            if (!list.contains(out))
                list.add(out);
        }
        else
            for(int i=0; i < seq.length(); i++)
                generate(remove(seq,i), out+seq.charAt(i), list);
    }

    public static String remove(String str, int idx){
        return str.substring(0, idx)+str.substring(idx+1);
    }

    public static List<String> singlePermutations(String s) {
        List<String> list = new ArrayList<>();
        for(int i=0; i < s.length(); i++){
            generate(remove(s,i), ""+s.charAt(i), list);
        }
        return list;
    }
}
