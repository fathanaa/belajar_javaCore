package oop.abstraction.laptop;

public class Acer implements Laptop{

    private final String merek = "Acer";

    @Override
    public int ram(int size) {
        return 0;
    }

    @Override
    public void os() {

    }

    @Override
    public String namaMerek() {
        return null;
    }
}
