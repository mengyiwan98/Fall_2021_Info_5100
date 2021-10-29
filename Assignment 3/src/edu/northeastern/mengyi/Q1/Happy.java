package edu.northeastern.mengyi;

public class Happy extends Moody {

    @Override
    public String getMood() {
        return "I feel happy today";
    }

    @Override
    public void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    @Override
    public String toString() {
        return "Subject laughs a lot";
    }

    @Override
    public void queryMood() {
        System.out.println("I feel happy Today");
    }
}
