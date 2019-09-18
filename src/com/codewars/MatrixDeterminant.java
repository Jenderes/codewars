package com.codewars;

public class MatrixDeterminant {
    public static void main(String[] args) {
        int[][][] matrix = {{{1}}, {{1, 3}, {2, 5}}, {{2, 5, 3}, {1, -2, -1}, {1, 3, 4}}};
        System.out.println(determinant(matrix[2]));
    }

    public static int determinant(int[][] matrix) {
        if (matrix[0].length == 1) {
            return matrix[0][0];
        } else if (matrix[0].length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            int firsts = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
            int Seconds = matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[2][0] * matrix[1][2]);
            int Thirds = matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
            return firsts - Seconds + Thirds;
            // Edit
        }
    }
}