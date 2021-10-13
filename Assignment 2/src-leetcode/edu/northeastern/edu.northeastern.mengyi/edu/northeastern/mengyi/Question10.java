package edu.northeastern.mengyi;

public class Question10 {

    public static void main(String[] args) {
        char[] chars1 = {'a','a','b','b','c','c','c'};
        char[] chars2 = {'a'};
        char[] chars3 = { 'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        char[] chars4 = {'a','a','a','b','b','a','a'};
        System.out.println(compress(chars1));
        System.out.println(compress(chars2));
        System.out.println(compress(chars3));
        System.out.println(compress(chars4));
    }

    public static int compress(char[] chars) {
        int count = 1;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            if (count == 1) {
                chars[index++] = chars[i];
            } else {
                chars[index++] = chars[i];
                String num = String.valueOf(count);
                for (int j = 0; j < num.length(); j++) {
                    chars[index++] = num.charAt(j);
                }
            }
            count = 1;
        }
        return index;
    }
}
