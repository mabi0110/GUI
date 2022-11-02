package cw5.zad2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WithStreamsV2 {

    private static final List<Student> students = new ArrayList<>();
    private static final String FILE_NAME = "students.txt";
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader(FILE_NAME);
             BufferedReader reader = new BufferedReader(fileReader)
        ) {

            Map<String, List<Student>> studentsMap = reader
                    .lines()
                    .map(s -> new Student(s.split(" ")[0], s.split(" ")[1], Integer.parseInt(s.split(" ")[2])))
                    .collect(Collectors.groupingBy(Student::getGroupNumber));

            studentsMap.forEach((String group, List<Student> students) ->
                    System.out.println("Group " + group + ": " + studentsMap.get(group)));

        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Błąd we/wy");
        }
    }
}
