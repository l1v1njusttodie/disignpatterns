package com.company;

public class RedCarsDecorator extends CarsDecorator {

    public RedCarsDecorator(Cars decoratedCars)
    {
        super(decoratedCars);
    }

    @Override public void buy()
    {
        decoratedCars.buy();
        setRedColor(decoratedCars);
    }

    private void setRedColor(Cars decoratedCars)
    {
        System.out.println("Color: Red");
    }
}
