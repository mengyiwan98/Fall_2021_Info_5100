package edu.northeastern.mengyi;

public class Question3 {
    public static void main(String[] args) {
        int [] array = new int[] {2,3,4,2,2,3,5,7} ;
        for (int i = 0; i < args.length; i++) {
            int j;
            for (j = 0; j < args.length; j++)
                if (i != j && args[i] == args[j])
                    break;
            if (j == args.length)
                System.out.println(args[i]);
        }
    }
}
