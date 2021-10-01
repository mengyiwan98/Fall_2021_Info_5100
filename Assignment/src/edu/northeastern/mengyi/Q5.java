package edu.northeastern.mengyi;

import javax.swing.*;

public class Q5 {

    public boolean letterDigital(String a) {
        char[] ch = a.toCharArray();
        if (Character.isLetter(ch[0])) {
            for (int i = 0; i < ch.length; i = i + 2) {
                if (!Character.isLetter(ch[i])) {
                    return false;
                }
            }
        }
        if (Character.isDigit(ch[0])) {
            for (int i = 0; i < ch.length; i = i + 2) {
                if (!Character.isDigit(ch[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}

