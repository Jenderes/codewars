package com.codewars;

public class StripComments {
    public static void main(String args[]){
        System.out.println("apples, pears # and bananas\\grapes\\bananas !apples");
        System.out.println(stripComments( "apples, pears # and bananas\\grapes\\bananas !apples", new String[] { "#", "!" } ));
    }
    public static String stripComments(String text, String[] commentSymbols) {
        char[] TextArray = text.toCharArray();
        char csh1 = commentSymbols[0].charAt(0);
        char csh2 = commentSymbols[1].charAt(0);
        for (int i = 0; i < TextArray.length; i++) {
            if ((TextArray[i] == ' ' && TextArray[i+1] == csh1) || (TextArray[i] == ' ' && TextArray[i+1] == csh2) ){
                TextArray[i] = TextArray[i+1];
            }
            if (csh1 == TextArray[i] &&  i+1 < TextArray.length) {
                if (TextArray[i+1] != '\\') {
                    TextArray[i + 1] = TextArray[i];
                }
            } else if (csh2 == TextArray[i] && i+1 < TextArray.length) {
                if (TextArray[i+1] != ' ') {
                    TextArray[i + 1] = TextArray[i];
                }
            }
        }
        String str = new String(TextArray);
        str = str.replaceAll(commentSymbols[0],"");
        str = str.replaceAll(commentSymbols[1],"");
        return str;
    }
}
