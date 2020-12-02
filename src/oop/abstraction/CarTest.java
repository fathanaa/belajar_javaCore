package oop.abstraction;

public class CarTest {
    public static void main(String[] args) {
        car car1 = new ManualCar();
        car car2 = new AutomaticCar();

        car1.turnOncar();
        car1.turnOffcar();
        System.out.println(car1.getCarType());

        car2.turnOncar();
        car2.turnOffcar();
        System.out.println(car2.getCarType());
    }
}
