package BasicJavaPondit;

import java.util.ArrayList;
import java.util.Scanner;

public class ProblemDayfifth {
    public static void main(String[] args) {
        //problem one
        //problemOne();

        //problem two
        //problemTwo();

        //problem three
        //problemThree();

        //problem four
        problemFour();

    }
    public static void problemOne(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter something to revers");
        String input = scn.nextLine();
        String newInput = "";
        for(int i = input.length()-1; i >= 0; i--){
            newInput += input.charAt(i);
        }
        System.out.print(newInput);
    }

    public static void problemTwo(){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter something to revers");
        Integer input = scn.nextInt();
        while (input > 0){
            list.add(input%2);
            input = input/2;
        }
        System.out.println(list);
    }

    public static void problemThree(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter x^y  numbers");
        int numOne = scn.nextInt();
        int numTwo = scn.nextInt();
        System.out.printf("x^y=%d", (int)Math.pow(numOne,numTwo));
    }

    public static void problemFour(){
        int count = 5;

        for(int i = 0; i <= count; i++){
            for(int k = count-i; k > 0; k--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
