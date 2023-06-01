package Simplilearn;

import java.util.TreeSet;

public class TreeSetDEmo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("c");
        treeSet.add("c");

        System.out.println(treeSet);
    }
}
