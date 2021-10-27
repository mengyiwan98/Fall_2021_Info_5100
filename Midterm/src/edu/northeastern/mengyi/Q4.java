package edu.northeastern.mengyi;

public class Q4 {
    public int longestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            while (j < s.length() && !isDuplicated(s, i, j, s.charAt(j))) {
                j++;
            }
            if (j - i > max) max = j - i;
        }
        return max;
    }
    public boolean isDuplicated(String s, int start, int end, char ch) {
        for (int i = start; i < end; i++) {
            if (s.charAt(i) == ch)
                return true;
        }
        return false;
    }
}
