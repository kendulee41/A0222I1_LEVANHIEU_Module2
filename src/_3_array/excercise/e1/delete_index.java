package _3_array.excercise.e1;

import java.util.Scanner;

public class delete_index {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter size array:");
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter array[" + i + "]: ");
            arr[i] = s.nextInt();
        }
        System.out.println("first array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%5d", arr[i]);
        }
        System.out.println("\nDelete value: ");
        int number = s.nextInt();
        int leng = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                leng--;
                for (int j = i; j < leng; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[leng] = 0;
                i--;
            }
        }
        System.out.println("last array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%5d", arr[i]);
        }
    }
}
