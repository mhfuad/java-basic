package BasicJavaPondit.problems;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the length of ");
//        int length = sc.nextInt();
        int length = 5;
        int k = 4;
        for(int i = 0; i < length; i++){
            while(k > 0){
                System.out.println(" ");
                k -= i;
            }
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
