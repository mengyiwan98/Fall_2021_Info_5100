package edu.northeastern.mengyi;

import java.util.Arrays;

public class Question2 {

    public int[] main(int[] args) {
        int[] result = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            int num = args[i];
            result[i] = num * num;
        }
        Arrays.sort(result);
        return result;
    }
}
