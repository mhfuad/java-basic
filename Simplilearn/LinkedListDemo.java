package Simplilearn;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("fuad");
        list.add("death");
        list.addLast("Ajrail");
        list.addFirst("kobor");
        list.add(2,"Hasan");

        System.out.println(list);

        list.remove("Hasan");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        //list.sort();
        System.out.println(list);

    }
}
