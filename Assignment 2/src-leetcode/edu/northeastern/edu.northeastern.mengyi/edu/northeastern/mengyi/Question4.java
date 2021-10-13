package edu.northeastern.mengyi;

import java.util.Arrays;

public class Question4 {

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] matrix3 = {{1}};
        int[][] matrix4 = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(rotate(matrix1)));
        System.out.println(Arrays.deepToString(rotate(matrix2)));
        System.out.println(Arrays.deepToString(rotate(matrix3)));
        System.out.println(Arrays.deepToString(rotate(matrix4)));
    }

    public static int[][] rotate(int[][] matrix) {
        int len = matrix.length;
        for(int i = 0; i < len / 2; i++) {
            for(int j = 0; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - 1 - i][j];
                matrix[len - 1 - i][j] = temp;
            }
        }

        for(int i = 0; i < len; i++) {
            for(int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
}