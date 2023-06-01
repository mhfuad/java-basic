package Simplilearn;

import java.util.HashSet;
import java.util.Set;

public class HasSetDemo {
    public static void main(String[] args) {
        Set<String> hasSet = new HashSet<>();

        hasSet.add("b");
        hasSet.add("a");
        hasSet.add("c");
        hasSet.add("d");
//        boolean r1 = hasSet.add("d");
//        boolean r2 = hasSet.add("d");

//        System.out.println(r1);
//        System.out.println(r2);
//
//        System.out.println(hasSet);

//        System.out.println("Set contain c or not "+ hasSet.contains("c"));
        for(String s: hasSet){
            System.out.println(s);
        }
    }
}
