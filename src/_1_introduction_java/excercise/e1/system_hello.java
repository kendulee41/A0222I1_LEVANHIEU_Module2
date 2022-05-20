package _1_introduction_java.excercise.e1;

import java.util.Scanner;

public class system_hello {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello "+name);
    }
}
