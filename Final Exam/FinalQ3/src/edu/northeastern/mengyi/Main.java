package edu.northeastern.mengyi;

//Input: nums = [1,1,1], k = 2
//Output: 2

public class Main {
    public static void main(String[] args) {

    }

    static class Solution {
        public int subarraySum(int[] nums, int k) {
            int count = 0;
            int len = nums.length;
            for (int left = 0; left < len; left++) {
                int sum = 0;
                for (int right = left; right < len; right++) {
                    sum += nums[right];
                    if (sum == k) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
