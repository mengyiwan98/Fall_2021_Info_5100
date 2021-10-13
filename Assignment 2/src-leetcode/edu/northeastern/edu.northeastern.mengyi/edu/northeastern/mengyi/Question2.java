package edu.northeastern.mengyi;

public class Question2 {

    public static void main(String[] args) {

        String[] wordDict = new String[]{"practice","makes","perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
        String word3 = "makes";
        System.out.println(shortestDistance(wordDict,word1,word2));
        System.out.println(shortestDistance(wordDict,word3,word1));
    }

    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        int left = 0, right = 0;
        int result = Integer.MAX_VALUE;
        while (left < wordsDict.length && right < wordsDict.length) {

            while (left < wordsDict.length && !wordsDict[left].equals(word1))
                left++;
            while (right < wordsDict.length && !wordsDict[right].equals(word2))
                right++;
            if (left == wordsDict.length || right == wordsDict.length)
                break;
            if (right - left == 0)
                continue;
            else
                result = Math.min(result, Math.abs(right - left));
            if (left < right)
                left++;
            else right++;
        }
        return result;
    }
}

