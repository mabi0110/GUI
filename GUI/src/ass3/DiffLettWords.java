package ass3;

import cw5.zad2.Student;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DiffLettWords {
    public static void main(String[] args) {
//        String book = "schultz_sklepy_cynamonowe_UTF8.txt";
        String book = "melville_moby_dick.txt";

        int minLen = 5; // ignore words shorter than minLen
        try (Stream<String> lines = Files.lines(Paths.get(book))) {
            Map<Integer, List<String>> map = lines
                    .map(x -> x
                            .replaceAll("--", " ")
                            .replaceAll("-", " "))
                    .map(x -> x.split(" "))
                    .flatMap(Arrays::stream)
                    .distinct()
                    .sorted()
                    .filter(DiffLettWordsBasic::isUnique)
                    .map(x -> x.replaceAll("[,.?!;:\"]", ""))
                    .filter(x -> x.length() > minLen)
                    .collect(Collectors.groupingBy(String::length));

// just printing
            List<Integer> lastTwo = map
                    .keySet()
                    .stream()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("Two lists of the longest words with all letters different:");
            int len = lastTwo.get(lastTwo.size() - 2);
            System.out.println("length " + len + ": " + map.get(len));
            len = lastTwo.get(lastTwo.size() - 1);
            System.out.println("length " + len + ": " + map.get(len));
        } catch (IOException e) {
            System.out.println("Something wrong...");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
