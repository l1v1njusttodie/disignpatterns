package com.company;

public class Labrador extends Dog {
    public Labrador(){
        runBehavior = new Run();
        barkBehavior = new Bark();
    }
    public void display(){
        System.out.println("I am labrador");
    }
}
