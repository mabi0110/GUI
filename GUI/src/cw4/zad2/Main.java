package cw4.zad2;

public class Main {
    public static void main(String... args) {
        int ini = 77031, count = 0, maxel = 0;
        Hailstone hailstone = new Hailstone(ini);
        for (int h : hailstone) {
//            System.out.print(h + " ");
            if (h > maxel) maxel = h;
            ++count;
        }
//        System.out.println();
        System.out.println(ini + " " + count + " " + maxel);
    }
}
