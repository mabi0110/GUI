package cw4.zad1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class RetLambda {
    // generic static function comCmp
    private static <T, R extends Comparable<? super R>> Comparator<T> compCmp(Comparator<T> comparator, Function<T,R> function) {
        Comparator<T> comp = new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                int compareByName = comparator.compare(o1, o2);
                if (compareByName != 0) {
                    return compareByName;
                }
                return function.apply(o1).compareTo(function.apply(o2));

            }
        };
        return comp;
    }

    public static void main(String[] args) {
        Person[] arr = {
                new Person("Eve", 43), new Person("Joe", 34),
                new Person("Kim", 30), new Person("Joe", 25),
                new Person("Kim", 20), new Person("Eve", 27),
        };
        Comparator<Person> cmp = compCmp(
                (p1, p2) -> p1.getName().compareTo(p2.getName()),
                Person::getAge
        );
        Arrays.sort(arr, cmp);
        System.out.println(Arrays.toString(arr));
    }
}

class Person {
    String name;
    int age;
    Person(String n, int a) {
        name = n;
        age = a;
    }
    String getName() { return name; }
    int getAge() { return age; }
    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}
