package edu.northeastern.mengyi;

public class Q3 {

    public static void main(String[] args) {
        int a[] = new int[]{2, 3, 4, 2, 2, 3, 5, 7};
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    index++;
                }
            }
            if (index == 1) {
                System.out.println(a[i]);
                break;
            } else {
                index = 0;
            }
        }
    }
}