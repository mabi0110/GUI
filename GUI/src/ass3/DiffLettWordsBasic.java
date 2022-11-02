package ass3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DiffLettWordsBasic {

    static String book = "schultz_sklepy_cynamonowe_UTF8.txt";
    //    static String book = "melville_moby_dick.txt";

    public static void main(String[] args) {
        int minLen = 5;
        try (Stream<String> lines = Files.lines(Paths.get(book))) {

            Map<Integer, List<String>> map = lines
                    .map(x -> x
                            .replaceAll("--", " ")
                            .replaceAll("-", " "))
                    .map(x -> x.split(" "))
                    .flatMap(Arrays::stream)
                    .distinct()
                    .filter(DiffLettWordsBasic::isUnique)
                    .map(x -> x.replaceAll("[,.?!;:\"]", ""))
                    .filter(x -> x.length() > minLen)
                    .collect(Collectors.groupingBy(String::length));

            map.forEach((Integer i, List<String> list) ->
                    System.out.println(i + " - " + map.get(i)));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isUnique(String s) {
        Set<Character> set = new HashSet<>();
        char[] characters = s.toCharArray();
        for (Character c : characters) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }
}
