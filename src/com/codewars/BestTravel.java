package com.codewars;
import java.util.*;
public class BestTravel {
    public static void main(String[] args) {

    }
    public static Integer chooseBestSumBestAnswer(int t, int k, List<Integer> ls) {
        int result = -1;
        for (int i=0; i<ls.size(); ++i){
            if (ls.get(i)<=t){
                if(k==1){
                    result=Math.max(result, ls.get(i));
                }
                else{
                    Integer temp = chooseBestSumBestAnswer(t-ls.get(i),k-1,ls.subList(i+1, ls.size()));
                    if (temp!=null){
                        result=Math.max(result, ls.get(i)+temp);
                    }
                }
            }
        }

        if (result<0) return null;
        return result;
    }
}
