package edu.northeastern.mengyi;

public class Main {

    public static void main(String[] args) {
        Sad sadObject = new Sad();
        Happy happyObject = new Happy();
        Psychiatrist psychiatrist = new Psychiatrist();

        Psychiatrist.examine(happyObject);
        System.out.println();
        Psychiatrist.observe(happyObject);
        System.out.println();

        Psychiatrist.examine(sadObject);
        System.out.println();
        Psychiatrist.observe(sadObject);
        System.out.println();
    }
}
