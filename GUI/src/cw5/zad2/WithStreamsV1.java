package cw5.zad2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithStreamsV1 {
    private static final List<Student> students = new ArrayList<>();
    private static final String FILE_NAME = "students.txt";
    public static void main(String[] args) {
        Map<String, List<Student>> studentsMap = new HashMap<>();
        try (FileReader fileReader = new FileReader(FILE_NAME);
             BufferedReader reader = new BufferedReader(fileReader)
        ) {
            reader.lines().forEach(line-> {
                String[] data = line.split(" ");
                String key = data[1];
                Student student = new Student(data[0], data[1], Integer.parseInt(data[2]));
                if (studentsMap.containsKey(key)) {
                    studentsMap.get(key).add(student);
                } else {
                    List<Student> studentsList = new ArrayList<>();
                    studentsList.add(student);
                    studentsMap.put(key, studentsList);
                }
            });

            Set<Map.Entry<String, List<Student>>> entries = studentsMap.entrySet();
            for (Map.Entry<String, List<Student>> entry : entries) {
                System.out.println("Group " + entry.getKey() + ": " + entry.getValue());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Błąd we/wy");
        }
    }
}
