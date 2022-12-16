package CollectionsTest;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("a");
        list.add("B");
        list.addLast("C");
        list.addFirst("D");
        list.add(2, "E");

        System.out.println(list);

        list.remove("B");
        list.remove(3);
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}
