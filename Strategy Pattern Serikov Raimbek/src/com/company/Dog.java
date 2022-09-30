package com.company;

import com.company.BarkBehavior;

public abstract class Dog {
    RunBehavior runBehavior;
    BarkBehavior barkBehavior;

    public  abstract void display();

    public void performRun() {runBehavior.run(); }
    public void performBark() {barkBehavior.bark(); }

}
