package CollectionsTest;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MethodsOfCollectionFramwork {
    public static void main(String[] args) {
        //6	public boolean retainAll(Collection<?> c)
//        List<String> items = new ArrayList<>();
//        items.addAll(List.of("Hi", "bal", "cal", "pal"));
//        items.retainAll(List.of("Hi"));
//        items.forEach(System.out::println);

        //11.public Iterator iterator()
        List<String> list = new ArrayList<>();
        list.add("good");
        list.add("bad");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
