package com.company;

public class PlushyLabrador extends Dog {
    public PlushyLabrador() {
        runBehavior = new NoRun();
        barkBehavior = new Mute();
    }
    public void display(){
        System.out.println("I am plushy labrador");
    }
}
