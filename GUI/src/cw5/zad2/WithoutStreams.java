package cw5.zad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WithoutStreams {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        try {
            Map<String, List<Student>> studentsMap = readFromFile(FILE_NAME);
            Set<Map.Entry<String, List<Student>>> entries = studentsMap.entrySet();
            for (Map.Entry<String, List<Student>> entry : entries) {
                System.out.println("Group " + entry.getKey() + ": " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku: " + FILE_NAME);
        }
    }

    static Map<String, List<Student>> readFromFile(String filename) throws FileNotFoundException {
        Map<String, List<Student>> studentsMap = new HashMap<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(" ");
                String keyName = data[1];
                Student student = new Student(data[0], data[1], Integer.parseInt(data[2]));
                if (studentsMap.containsKey(keyName)) {
                    studentsMap.get(keyName).add(student);
                } else {
                    List<Student> purchaseList = new ArrayList<>();
                    purchaseList.add(student);
                    studentsMap.put(keyName, purchaseList);
                }
            }
        }
        return studentsMap;
    }
}
