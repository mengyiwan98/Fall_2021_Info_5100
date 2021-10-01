package edu.northeastern.mengyi;

import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) {
	// write your code here
    }
    public int[] sortedSquares(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            result[i] = num * num;
        }
        Arrays.sort(result);
        return result;
    }
}