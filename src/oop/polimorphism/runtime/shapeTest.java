package oop.polimorphism.runtime;

public class shapeTest {
    public static void main(String[] args) {
        Shape sh = new Circle();
        Shape sh1 = new Square();

        System.out.println(sh.draw());
        System.out.println(sh1.draw());
    }
}
