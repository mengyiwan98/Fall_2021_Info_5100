package edu.northeastern.mengyi;

public class Q1 {

    public static void main(String[] args) {
	// write your code here
    }
    public static int sumOfUnique(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        int sum = 0;
        for (int j = 1; j <= nums.length - 1; j++) {
            if (arr[j] == 1) sum += j;
        }
        return sum;
    }
}
