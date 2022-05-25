package _4_class_object.excercise.e1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.printf("Có 2 nghiệm: x1 = %.1f, x2 =%.1f", (-b + Math.pow(delta, 0.5)) / (2 * a), (-b - Math.pow(delta, 0.5)) / (2 * a));
        } else if (delta == 0) {
            System.out.printf("Có 2 nghiệm x1=x2=%.1f", (-b / (2 * a)));
        } else {
            System.out.println("Vô nghiệm");
        }
    }
}
