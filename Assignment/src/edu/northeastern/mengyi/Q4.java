package edu.northeastern.mengyi;

public class Q4 {

    public static void main(String[] args) {
        // write your code here
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] array = new int[26];
        int[] array2 = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            array[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            array2[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (array[i] != 0 && array[i] > array2[i]) return false;
        }
        return true;
    }
}
