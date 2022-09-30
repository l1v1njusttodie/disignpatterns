package com.company;

public class Mute implements BarkBehavior{
    @Override
    public void bark() {
        System.out.println("I can't do any sound, I am just a toy");
    }
}
