package com.company;

public class Main {

    public static void main(String[] args) {
        Cars Lambo = new Lamborghini();

        Cars redLambo = new RedCarsDecorator(new Lamborghini());

        Cars redPorsche = new RedCarsDecorator(new Porsche());

        System.out.println("Casual Lamborghini");

        Lambo.buy();

        System.out.println("\nRed Lamborghini");

        redLambo.buy();

        System.out.println("\nRed Porsche");

        redPorsche.buy();
    }
}