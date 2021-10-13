package edu.northeastern.mengyi;

import java.util.HashMap;
import java.util.Map;

public class Question6 {

    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";
        System.out.println(isIsomorphic(s1,t1));
        String s2 = "foo";
        String t2 = "bar";
        System.out.println(isIsomorphic(s2,t2));
        String s3 = "paper";
        String t3 = "title";
        System.out.println(isIsomorphic(s3,t3));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> maps = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            if (maps.containsKey(s.charAt(i))) {
                if (t.charAt(i) != maps.get(s.charAt(i)))
                    return false;
            } else if (maps.containsValue(t.charAt(i))) {
                if (!maps.containsKey(s.charAt(i)))
                    return false;
            } else {
                maps.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}

