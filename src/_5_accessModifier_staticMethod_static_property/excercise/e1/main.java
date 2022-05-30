package _5_accessModifier_staticMethod_static_property.excercise.e1;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.printf("Radius: %.1f, Color: %s", circle.getRadius(), circle.getColor());
        circle.setRadius(3);
        circle.setColor("yellow");
        System.out.printf("\nRadius: %.1f, Color: %s", circle.getRadius(), circle.getColor());
    }
}
