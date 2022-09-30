package com.company;

public class Main {

    public static void main(String[] args) {
	Dog labrador = new Labrador();
    labrador.display();
    labrador.performBark();
    labrador.performRun();
    System.out.println(" ");
    Dog plushy = new PlushyLabrador();
    plushy.display();
    plushy.performBark();
    plushy.performRun();
    }
}
