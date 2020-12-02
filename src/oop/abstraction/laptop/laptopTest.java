package oop.abstraction.laptop;

public class laptopTest {
    public static void main(String[] args) {
        Laptop laptop1 = new Asus();
        Laptop laptop2 = new Acer();

        System.out.println(laptop1.ram(8));
        laptop1.os();
        System.out.println(laptop1.namaMerek());

        System.out.println(laptop2.ram(8));
        laptop2.os();
        System.out.println(laptop2.namaMerek());
    }
}
