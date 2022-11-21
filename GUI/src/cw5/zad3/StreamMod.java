//package cw5.zad3;
//
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//import static java.util.stream.Collectors.groupingBy;
//
//public class StreamMod {
//    static int M = 10;
//    public static void main(String[] args) {
//        Random r = new Random();
//        final int N = 20, M = 10;
//
//        List<Integer> ints = IntStream
//                .iterate(0, i -> i + 1)
//                .limit(M)
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println(ints);
//
//        Map<Integer, List<Double>> map = Stream.generate(r::nextInt)
//                .limit(N).collect(groupingBy(StreamMod::dividedBy()));
//
//
//
////        List<Integer> ints = IntStream
////                .iterate(0, i -> i + 1)
////                .limit(M)
////                .boxed()
////                .collect(Collectors.toList());
////        System.out.println(ints);
////
////        Stream.generate(r::nextInt)
////                .limit(N)
////                .filter(x -> x % M == incrementValue(0))
////                .forEach(s -> System.out.print(s + " "));
//
//
//}
//
//    private List<Double> dividedBy() {
//        List<Double> list = new ArrayList<>();
//        List<Integer> ints = IntStream
//                .iterate(0, i -> i + 1)
//                .limit(M)
//                .boxed()
//                .toList();
//        for (int i = 0; i < ints.size(); i++) {
//            if ()
//        }
//    }
//
//    private static int incrementValue(int x) {
//        return x + 1;
//    }
//}
