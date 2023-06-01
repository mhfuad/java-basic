package BasicJavaPondit;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("before:");
        printArray(numbers);

        System.out.println("after:");
        printArray(numbers);
    }

    public static void printArray(int[] numbers){
        for (int i = 0; i<= numbers.length - 1; i++){
            System.out.println(numbers[i]+",");
        }
    }
}
