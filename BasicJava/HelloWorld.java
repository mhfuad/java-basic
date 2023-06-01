package BasicJava;

import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        addTwoNumbers(l1, l2);
    }

    public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        for(int i = 0; i <= l1.size(); i++){
            System.out.println(l1.indexOf(1));
            int extranumber = 0;

            l3.add(l1.indexOf(i) + l2.indexOf(i) );
            System.out.println(l1.indexOf(i));
        }
        return l3;
    }
}
