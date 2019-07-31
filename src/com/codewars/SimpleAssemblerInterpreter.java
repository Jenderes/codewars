package com.codewars;
import java.util.*;

public class SimpleAssemblerInterpreter {
    public static void main(String args[]){
        String[] program = new String[]{"mov c 2", "mov b 0", "mov a 3", "dec a", "inc b", "jnz a -2", "dec c", "mov a b", "jnz c -5", "jnz 0 1", "mov c a"};
        Map<String, Integer> out = new HashMap<String, Integer>();
        System.out.println(interpret(program));
    }
    public static Map<String, Integer> interpret(String[] program){
        if (program.length == 0){
            return null;
        }
        Map<String, Integer> out = new HashMap<String, Integer>();
        int k = 0;
        int set = 0;
        while  (k < program.length){
            String numb = program[k].substring(0,3);
            set = program[k].length();
            switch(numb){
                case("mov"):
                    if (isNumeric(program[k].substring(6,set))) {
                        out.put(program[k].substring(4, 5), Integer.parseInt(program[k].substring(6, set)));
                        k++;
                    } else {
                        out.put(program[k].substring(4, 5), out.get(program[k].substring(6, set)));
                        k++;
                    }
                    break;
                case("inc"):
                    out.put(program[k].substring(4, 5), out.get(program[k].substring(4, 5))+1);
                    k++;
                    break;
                case("dec"):
                    out.put(program[k].substring(4, 5), out.get(program[k].substring(4, 5))-1);
                    k++;
                    break;
                case("jnz"):
                    if(Integer.parseInt(program[k].substring(6, set)) > 0){
                        if (isNumeric(program[k].substring(4,5))) {
                            k = k + Integer.parseInt(program[k].substring(6, set));
                        } else {
                            if(out.get(program[k].substring(4, 5)) != 0){
                                k = k + Integer.parseInt(program[k].substring(6, set));
                            } else {
                                k++;
                            }
                        }
                    } else {
                        if (out.get(program[k].substring(4, 5))!= 0){
                            k = k + Integer.parseInt(program[k].substring(6, set));
                        } else {
                            k++;
                        }
                    }
                    break;
            }
        }
        return out;
    }
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
}
