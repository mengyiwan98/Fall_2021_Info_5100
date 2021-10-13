package edu.northeastern.mengyi;

public class Question7 {

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        String num3 = "456";
        String num4 = "77";
        String num5 = "0";
        String num6 = "0";
        System.out.println(addStrings(num1,num2));
        System.out.println(addStrings(num3,num4));
        System.out.println(addStrings(num5,num6));
    }

    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (carry > 0 || i >= 0 || j >= 0) {

            if (i >= 0 && num1.charAt(i) > 0) {
                carry += num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0 && num2.charAt(j) > 0) {
                carry += num2.charAt(j) - '0';
                j--;
            }

            sb.append(carry % 10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }
}