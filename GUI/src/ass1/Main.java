package ass1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] studs = {
                new Student("Poland", "Jan", "Kowalski"),
                new Student("France", "Jean", "Killy"),
                new Student("Poland", "Maria", "Nowak"),
                new Student("Poland", "Julia", "Nowak"),
                new Student("Germany", "Hans", "Schultz"),
                new Student("France", "Jeanne", "Marat"),
        };
        Arrays.sort(studs);
        System.out.println("Students: by lastname, firstname, country");
        for (Student s : studs)
            System.out.println(s);
        Citizen[] cits = {
                new Citizen("Poland", "Jan", "Kowalski"),
                new Citizen("France", "Jean", "Killy"),
                new Citizen("Poland", "Maria", "Nowak"),
                new Citizen("Poland", "Julia", "Nowak"),
                new Citizen("Germany", "Hans", "Schultz"),
                new Citizen("France", "Jeanne", "Marat"),
        };
        Arrays.sort(cits);
        System.out.println("Citizens: by country, lastname, firstname");
        for (Citizen c : cits)
            System.out.println(c);
    }

}
