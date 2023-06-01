package BasicJavaPondit;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100000);
        }

        System.out.println("before:");
        printArray(numbers);

        boolean swhepable = true;
        while (swhepable){
            swhepable = false;
            for(int i = 0; i <= numbers.length -1; i++){
                if(i == numbers.length - 1  ){
                    continue;
                }
                if(numbers[i] > numbers[i + 1]){
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swhepable = true;
                }
            }
        }

        System.out.println("after:");
        printArray(numbers);

    }
    public static void printArray(int[] numbers){
        for (int i = 0; i<= numbers.length - 1; i++){
            System.out.println(numbers[i]+",");
        }
    }
}
