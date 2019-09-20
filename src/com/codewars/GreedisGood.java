package com.codewars;

public class GreedisGood {
    public static void main(String[] args) {
        System.out.println(greedy(new int[]{2,4,4,5,4}));
    }
    public static int greedy(int[] dice){
        int sum = 0;
        int[] CountNum = {0,0,0,0,0,0};
        int[] gred = {1000,200,300,400,500,600};
        for (int i = 0; i < dice.length; i++){
            CountNum[dice[i]-1] += 1;
        }
        for (int i = 0; i < CountNum.length; i++){
            if (i == 0){
                    sum += (CountNum[i]%3)*100 + (CountNum[i]/3)*1000;
            } else if(i == 4){
                    sum += (CountNum[i]%3)*50 + (CountNum[i]/3)*500;
            } else {
                sum += (CountNum[i]/3)*gred[i];
            }
        }
        return sum;
    }
}
