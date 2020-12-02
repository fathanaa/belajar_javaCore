package oop.polimorphism.compileTime;

public class compileTime {
    public void draw(){
        System.out.println("Drwaing circle with default color Black and diameter 1 cm.");
    }


    public void draw(int diameter){
        diameter = 111;
        System.out.println("Drwaing circle with default color Black and diameter."+diameter);
    }

}
