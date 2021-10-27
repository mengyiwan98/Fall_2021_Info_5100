package edu.northeastern.mengyi;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Printer db = Printer.getInstance();
        System.out.println(db.getConnection());
    }
}
