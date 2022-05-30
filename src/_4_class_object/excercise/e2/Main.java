package _4_class_object.excercise.e2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Arrays.sort(arr);
        stopWatch.stop();
        System.out.println("Times: " + stopWatch.getElapsedTime() + " ms");
    }
}
