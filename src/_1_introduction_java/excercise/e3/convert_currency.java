package _1_introduction_java.excercise.e3;

import java.util.Scanner;

public class convert_currency {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter USD: ");
        int usd = s.nextInt();
        int vnd = usd * rate;
        System.out.println("VNĐ: " + vnd + " VNĐ");
    }
}
