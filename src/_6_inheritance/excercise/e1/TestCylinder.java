package _6_inheritance.excercise.e1;

import java.util.Scanner;

public class TestCylinder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius, height & color:");
        double r =Double.parseDouble(s.nextLine());
        double h = Double.parseDouble(s.nextLine());
        String color = s.nextLine();
        Cylinder cylinder = new Cylinder(r,color,h);
        System.out.println(cylinder.toString());
    }
}
