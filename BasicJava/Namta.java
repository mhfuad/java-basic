package BasicJava;

import java.util.Scanner;

public class Namta {
    public static void main(String[] args) {
        //for
        System.out.print("Enter the number you want to loop ");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        for(int i=1; i <= 10; i++){
            System.out.println(j+"*"+i+" = "+(i*j));
        }

        //do while
//        int i = 1;
//        do{
//            System.out.println(3+"*"+ i +"="+ (i*3));
//            i++;
//        }while(i<11);

        //while
//        int i = 1;
//        while (i <= 10){
//            System.out.println(3+"*"+ i +"="+ (i*3));
//            i++;
//        }
    }
}
