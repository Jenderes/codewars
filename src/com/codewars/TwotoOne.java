package com.codewars;
import java.util.*;
public class TwotoOne {
    public static void main(String[] args) {
        System.out.println(longest("aretheyhere", "yestheyarehere"));
    }
    public static String longest (String s1, String s2) {
        String str = s1 + s2;
        char[] chars = str.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        return sortString(sb.toString());
    }
    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public static String LongestTopAnswer (String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}

