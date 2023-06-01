package Streams;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();
        //******Filter******************
        //---------Imperative approach
//        List<Person> females = new ArrayList<>();
//        for (Person person : people) {
//            if (person.getGender().equals(Gender.FEMALE))
//                females.add(person);
//        }
//        females.forEach(System.out::println);

        //==========Filter
        List<Person> femals = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        //femals.forEach(System.out::println);
        //=========Sort
        List<Person> sortedList = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        //sortedList.forEach(System.out::println);
        //---------Revers Sort
        List<Person> reversSortedList = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());
        //reversSortedList.forEach(System.out::println);
        //=========All match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 8);
        //System.out.println(allMatch);
        //=========Any Match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 121);
        //System.out.println(anyMatch);
        //=========None Match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Alex Boz"));
        //System.out.println(noneMatch);
        //=========Max
//        Optional<Person> max = people.stream()
//                .max(Comparator.comparing(Person::getAge));
//        people.stream()
//                .max(Comparator.comparing(Person::getAge))
//                .ifPresent(System.out::println);
        //=========Min
//        Optional<Person> min = people.stream()
//                .max(Comparator.comparing(Person::getAge));
//        people.stream()
//                .min(Comparator.comparing(Person::getAge))
//                .ifPresent(System.out::println);

        //=============Group===========
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

//        groupByGender.forEach(((gender, people1) -> {
//            System.out.println(gender);
//            people1.forEach(System.out::println);
//            System.out.println();
//        }));
        //countByGender
        Map<Gender, Long> countByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender, Collectors.counting()));
        countByGender.forEach((Gender, count)->{
            System.out.println(Gender);
            System.out.println(count);
        });
    }

    private static List<Person> getPeople(){
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 99, Gender.MALE),
                new Person("Jamie Goa", 57, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
