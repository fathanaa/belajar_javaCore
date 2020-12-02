package oop.abstraction;

public class AutomaticCar implements car {
    private String carType = "Automatic";

    @Override
    public void turnOncar() {
        System.out.println("turn on automatic car");
    }

    @Override
    public void turnOffcar() {
        System.out.println("turn off automatic car");
    }

    @Override
    public String getCarType() {
        return this.carType;
    }
}
