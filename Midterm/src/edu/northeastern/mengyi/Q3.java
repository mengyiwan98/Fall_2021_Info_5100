package edu.northeastern.mengyi;

//Question 3) For the given array, return the sum of all the numbers which are repeated.
//Ex: Input : array = {1,3,-1,3,4,-1}
//Output : 3 + (-1) = 2

import java.util.HashSet;

public class Main {
    public static int sumOfRepeat(int[] arr) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int a : arr) {
            if (set.add(a) == false)
                sum += a;
        }
        return sum;
    }
}