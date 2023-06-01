package Simplilearn;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrayLIst = new ArrayList<Integer>();

        for(int i = 1; i <= 5; i++)
            arrayLIst.add(i);

        System.out.println(arrayLIst);
        for(int i = 0; i <= arrayLIst.size() -1; i++)
        System.out.println(arrayLIst.get(i));
    }
}
