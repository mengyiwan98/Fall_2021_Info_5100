package edu.northeastern.mengyi;

public class Psychiatrist {

    String moody;
    public static void examine(Moody Object){
        System.out.println("How are you feeling today?");
        Object.queryMood();
    }

    public static void observe(Moody Object){
        Object.ExpressFeelings();
        System.out.println("Observation: " + Object.toString());
    }

    @Override
    public String toString(){
        return "Observation:"+ moody;
    }
}
