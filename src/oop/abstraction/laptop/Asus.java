package oop.abstraction.laptop;

public class Asus implements Laptop{

    private final String merek = "Asus";

    @Override
    public int ram(int size){
        size = 8;
        return size;
    }

    @Override
    public void os() {
        System.out.println("Windows 10 X64");
    }

    @Override
    public String namaMerek() {
        return this.merek;
    }
}
