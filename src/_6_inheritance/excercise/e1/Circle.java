package _6_inheritance.excercise.e1;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return
                "radius=" + radius +
                        ", color=" + color;
    }
}
