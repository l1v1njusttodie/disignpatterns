package com.company;

public abstract class CarsDecorator implements Cars {


    protected Cars decoratedCars;

    public CarsDecorator(Cars decoratedCars)
    {
        this.decoratedCars = decoratedCars;
    }

    public void buy() { decoratedCars.buy(); }
}