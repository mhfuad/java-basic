package BasicJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("fuad", 120));
        people.add(new Person("Mahadi", 150));
        people.add(new Person("Abodullah", 100));
        people.add(new Person("Ahnaf", 50));

        /*List<Person> hundredClub = new ArrayList<>();
        for (Person p : people){
            if (p.billions >= 100){
                hundredClub.add(p);
            }
        }

        hundredClub.forEach(person -> System.out.println(person.name));*/



        /*List<Person> hundredClub2 = people.stream()
                .filter(person -> person.billions >= 100)
                .collect(Collectors.toList());
        hundredClub2.forEach(person -> System.out.println(person.name));

        List<Person> hundredSorted = people.stream()
                .sorted(Comparator.comparing(person -> person.name))
                .collect(Collectors.toList());
        hundredSorted.forEach(person -> System.out.println(person.name));*/


        List<Person> hundredSorted = people.stream()
                .filter(person -> person.billions >= 100)
                .sorted(Comparator.comparing(person -> person.name))
                .collect(Collectors.toList());
        hundredSorted.forEach(person -> System.out.println(person.name));

    }
}

class Person{
    String name;
    int billions;
    public Person(String name, int billions){
        this.name = name;
        this.billions = billions;
    }
}