package cw3.zad4;

import java.util.Arrays;
import java.util.Comparator;

public class EnumsLambdas {
    private static <T> void printArray(String title, T[] t) {
        System.out.println("*** " + title + " ***");
        for (T tElement : t) {
            System.out.println(tElement);
        }
    }


    public static void main(String[] args) {
        Person[] persons = {
                new Person("Max", Sex.M, Size.XL, Country.NL),
                new Person("Jan", Sex.M, Size.S, Country.PL),
                new Person("Eva", Sex.F, Size.XS, Country.NL),
                new Person("Lina", Sex.F, Size.L, Country.DE),
                new Person("Mila", Sex.F, Size.S, Country.DE),
                new Person("Ola", Sex.F, Size.M, Country.PL),
        };

//        Comparator<Person> sexThenSize = Comparator.comparing(Person::getSex).thenComparing(Person::getSize);
        Comparator<Person> sexThenSize = (p1, p2) -> {
            int sexCompare = p1.getSex().compareTo(p2.getSex());
            if(sexCompare != 0){
                return sexCompare;
            }
            return p1.getSize().compareTo(p2.getSize());
        } ;
        Arrays.sort(persons, sexThenSize);
        printArray("Persons by sex and then size", persons);
        Arrays.sort(persons, Comparator.comparing(Person::getSize).thenComparing(Person::getName));
//        Arrays.sort(persons, (p1, p2) -> {
//            int sizeCompare = p1.getSize().compareTo(p2.getSize());
//            if(sizeCompare != 0){
//                return sizeCompare;
//            }
//            return p1.getName().compareTo(p2.getName());
//        } );
        printArray("Persons by size and then name", persons);
        Country[] countries = Country.values();
        Arrays.sort(countries, Comparator.comparing(Enum::name));
//        Arrays.sort(countries, (c1, c2) ->
//             c1.name().compareTo(c2.name())
//        );
        printArray("Countries by name", countries);
    }
}
