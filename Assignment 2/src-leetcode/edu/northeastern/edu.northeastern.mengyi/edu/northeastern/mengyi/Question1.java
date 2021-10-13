package edu.northeastern.mengyi;

import java.util.Arrays;

public class Question1 {

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(transpose(matrix1)));
        System.out.println(Arrays.deepToString(transpose(matrix2)));
    }
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[col][row];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                ans[c][r] = matrix[r][c];
            }
        }
        return ans;
    }
}
