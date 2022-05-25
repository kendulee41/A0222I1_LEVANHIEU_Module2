package _3_array.excercise.e2;

import java.util.Scanner;

public class add_index {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int index = -1;
        int[] arr = {1, 4, 5, 6, 7, 8, 9, 10, 23, 22};
        System.out.println("Enter value to add:");
        int value = s.nextInt();
        while (index < 1 || index >= arr.length) {
            System.out.println("Enter index to add:");
            index = s.nextInt();
            if (index < 1 || index >= arr.length) {
                System.out.println("Error! Please again!");
            }
        }
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        System.out.println("last Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%5d", arr[i]);
        }
    }
}
