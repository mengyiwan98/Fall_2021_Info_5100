package edu.northeastern.mengyi;

import java.awt.*;

public class Main {

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
    public static void main(String[] args) throws AWTException {
        int[][] room = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {-1, 0, 0, 0},
                {0, 0, 0, -1},
        };

        Robot robot = new Robot();
    }
}

