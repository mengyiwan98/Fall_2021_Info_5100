package edu.northeastern.mengyi;

public class Main {

    public static void main(String[] args) {
        Fiction fiction = new fiction("Frankenstein");
        NonFiction nonFiction = new nonfiction("Anne Frank");

        System.out.println(fiction.toString());
        System.out.println(fiction.description());
        System.out.println(fiction.reference());

        System.out.println(nonFiction.toString());
        System.out.println(nonFiction.description());
        System.out.println(nonFiction.reference());
    }
}
