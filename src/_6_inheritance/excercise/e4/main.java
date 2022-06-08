package _6_inheritance.excercise.e4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 side: ");
        double side1 = s.nextDouble();
        double side2 = s.nextDouble();
        double side3 = s.nextDouble();
        triangle.set3Side(side1,side2,side3);
        System.out.println("Enter color");
        s.nextLine();
        String color = s.nextLine();
        triangle.setColor(color);
        System.out.println(triangle.toString());
    }
}
