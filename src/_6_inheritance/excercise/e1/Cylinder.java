package _6_inheritance.excercise.e1;

public class Cylinder extends Circle{
    private double height=5;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double volumetric(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "height=" + height +
                "\nvolume = "+volumetric()
                +"\nColor: "+getColor();
    }
}
