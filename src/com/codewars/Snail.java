package com.codewars;
import java.util.*;
import java.util.Arrays;
public class Snail {
    public static void main(String[] args) {
//        int[][] array
//                = {{851, 538, 974, 287, 353, 527, 387, 518, 759, 379, 576, 383, 532, 915},
//                {451, 69, 2, 471, 900, 404, 366, 304, 41, 958, 409, 619, 325, 732},
//                {146, 933, 956, 646, 136, 303, 472, 461, 580, 330, 47, 946, 957, 57},
//                {49, 98, 433, 464, 469, 997, 178, 694, 235, 573, 560, 922, 660, 156},
//                {98, 920, 864, 909, 742, 899, 470, 129, 914, 258, 973, 76, 371, 904},
//                {339, 963, 568, 136, 514, 252, 768, 10, 305, 771, 153, 412, 751, 188},
//                {553, 304, 250, 351, 131, 970, 248, 272, 809, 214, 327, 941, 395, 375},
//                {251, 909, 347, 686, 896, 585, 139, 16, 651, 539, 206, 406, 334, 468},
//                {451, 834, 35, 552, 400, 888, 398, 223, 388, 322, 446, 893, 765, 732},
//                {384, 603, 886, 166, 214, 761, 121, 913, 896, 619, 445, 698, 944, 286},
//                {167, 172, 240, 143, 188, 62, 332, 950, 665, 150, 892, 831, 259, 819},
//                {46, 144, 819, 777, 524, 644, 929, 459, 780, 914, 568, 35, 677, 136},
//                {328, 399, 135, 316, 752, 150, 399, 79, 768, 78, 898, 695, 805, 178},
//                {99, 245, 499, 113, 80, 298, 129, 606, 666, 234, 960, 601, 415, 679}};
        int[][] array = {
                {851, 538, 974, 287, 353},
                {451, 69, 2, 471, 900},
                {146, 933, 956, 646, 136},
                {49, 98, 433, 464, 469},
                {98, 920, 864, 909, 742}};
        System.out.println(Arrays.toString(snail(array)));
        System.out.println(snail(array).length);
    }
    public static int[] snail(int[][] array) {
        if (array.length == 1){
            return array[0];
        }
        ArrayList<Integer> arrst = new ArrayList<Integer>();
        int st = 0;
        int right = 0;
        int down = 0;
        int left = 0;
        int up = 0;
        int tt = 0;
        int sr = 0;
        ArrayList<Integer> arrs = new ArrayList<Integer>();
        while (tt != 2) {
            if (arrs.size() == 1){
                tt ++;
            }
            arrs.clear();
            if (st == 0) {
                for (int i = 0 + right; i < array.length - right; i++) {
                    arrs.add(array[0 + right][i]);
                }
                st++;
                right ++;
            } else if (st == 1) {
                for (int i = 1 + down; i < array.length - down; i++) {
                    arrs.add(array[i][array.length - 1 - down]);
                }
                st++;
                down++;
            } else if (st == 2) {
                for (int i = array.length - 2 - left; i >= 0 + left; i--) {
                    arrs.add(array[array.length - 1 - left][i]);
                }
                st++;
                left++;
            } else if (st == 3) {
                for (int i =1 + up ; i < array.length - 1 - up; i++) {
                    arrs.add(array[array.length -up - i - 1 + sr][up]);
                }
                st = 0;
                up++;
                sr++;
            }
            for (int i = 0; i < arrs.size(); i++) {
                arrst.add(arrs.get(i));
            }
        }
        int[] arr = new int[arrst.size()];
        for (int i = 0; i < arrst.size(); i++) {
            arr[i] = arrst.get(i);
        }
        return arr;
    }
    public static int[] snailBestAnswer(int[][] array) {
        if (array[0].length == 0) return new int[0];
        int n = array.length;
        int[] answer = new int[n*n];
        int index=0;
        for (int i = 0; i<n/2; i++){
            for (int j = i; j < n-i; j++) answer[index++] = array[i][j];
            for (int j = i+1; j < n-i; j++) answer[index++] = array[j][n-i-1];
            for (int j = i+1; j < n-i; j++) answer[index++] = array[n-i-1][n-j-1];
            for (int j = i+1; j < n-i-1; j++) answer[index++] = array[n-j-1][i];
        }
        if (n%2 != 0) answer[index++] = array[n/2][n/2];
        return answer;
    }
}