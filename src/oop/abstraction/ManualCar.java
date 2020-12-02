package oop.abstraction;

public class ManualCar implements car{
    private final String carType = "Manual";

    @Override
    public void turnOncar() {
        System.out.println("turn on manual car");
    }

    @Override
    public void turnOffcar() {
        System.out.println("turn off manual car");
    }

    @Override
    public String getCarType() {
        return this.carType;
    }
}
