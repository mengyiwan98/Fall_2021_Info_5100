package edu.northeastern.mengyi;

public class Question8 {

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1));
        String s2 = "race a car";
        System.out.println(isPalindrome(s2));
    }
    public static boolean isPalindrome(String s) {
        int len = s.length(), i = 0, j = len - 1;
        if(len == 1)
            return true;

        String str = s.toUpperCase();
        Character ch1, ch2;

        while(i <= j){
            ch1 = str.charAt(i); ch2 = str.charAt(j);
            while(!(Character.isLetter(ch1) || Character.isDigit(ch1)) && i + 1 < len)
                ch1 = str.charAt(++i);
            while(!(Character.isLetter(ch2) || Character.isDigit(ch2)) && j-1 >= 0)
                ch2 = str.charAt(--j);
            if(i + 1 == len || j == 0)
                return true;
            if(ch1 != ch2)
                return false;
            i++; j--;
        }

        return true;
    }
}
