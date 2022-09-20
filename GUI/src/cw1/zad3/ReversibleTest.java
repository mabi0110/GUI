package cw1.zad3;

public class ReversibleTest {
    public static void main(String[] args) {
        Reversible[] revers = new Reversible[]{
                new ReversibleString("Cat"),
                new ReversibleDouble(2),
                new ReversibleDouble(3),
                new ReversibleString("Dog"),
                new ReversibleString("Alice in Wonderland"),
                new ReversibleDouble(10),
        };
        System.out.println("Original:");
        for (Reversible r : revers) System.out.println(r);
        for (Reversible r : revers) {
            r.reverse();
        }
        System.out.println("Reversed:");
        for (Reversible r : revers) System.out.println(r);
        System.out.println("Reversed again and modified:");
        for (Reversible r : revers) {
            r.reverse();
        }
        for (Reversible r : revers) {
            if (r instanceof ReversibleDouble){
                ReversibleDouble modifiedDouble = (ReversibleDouble) r;
                System.out.println(modifiedDouble.getNumber() + 10);
            }
            if (r instanceof ReversibleString) {
                ReversibleString newString = (ReversibleString) r;
                System.out.println("Text: " + newString);
            }
        }
    }
}
