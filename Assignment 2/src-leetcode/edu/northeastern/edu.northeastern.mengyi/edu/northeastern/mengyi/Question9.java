package edu.northeastern.mengyi;

public class Question9 {

    public static void main(String[] args) {
        String s1 = "hello world";
        System.out.println(reverseWords(s1));
        String s2 = "the sky is blue";
        System.out.println(reverseWords(s2));
        String s3 = "a good example";
        System.out.println(reverseWords(s3));
        String s4 = "Bob Loves Alice";
        System.out.println(reverseWords(s4));
        String s5 = "Alice does not even like bob";
        System.out.println(reverseWords(s5));
    }
        public static String reverseWords(String s) {
            char[] c = s.toCharArray();
            int left = 0;
            int right = c.length - 1;
            StringBuilder str = new StringBuilder();
            while(c[left]==' ') left++;
            while(c[right] == ' ') right--;
            while(left <= right){
                int index = right;
                while(index >= left && c[index] != ' ' ) index--;
                for(int i = index+1 ; i <= right ; i++ ) str.append( c[i] );
                if(index > left) str.append(' ');
                while( index >= left && c[index]==' ' ) index--;
                right = index;
            }
            return str.toString();
    }
}
