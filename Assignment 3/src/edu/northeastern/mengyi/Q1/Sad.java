package edu.northeastern.mengyi;

public class Sad extends Moody{

    @Override
    public String getMood() {
        return "I feel sad today";
    }

    @Override
    public void ExpressFeelings() {
        System.out.println("‘waah’  ‘boo hoo’  ‘weep’ ‘sob’");
    }

    @Override
    public String toString() {
        return "Subject cries a lot";
    }

    @Override
    public void queryMood() {
        System.out.println("I feel sad Today");
    }
}
