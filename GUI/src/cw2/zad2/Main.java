package cw2.zad2;

public class Main {
    public static void main(String[] args) {
        Parabola p = new Parabola(1, -1, (double) 5 / (double) 4);
        double xMin1 = FunDD.xminim(p, 0, 1);

        FunDD funDD = new FunDD() {
            @Override
            public double fun(double x) {
                return Math.sqrt(Math.pow((x - 0.75), 2) + 1);
            }
        };
        double xMin2 = FunDD.xminim(funDD, 0, 2);

        double xMin3 = FunDD.xminim(x -> Math.pow(x, 2) * (x - 2), 0, 2);

        System.out.println("Parabola: ");
        System.out.println("Funkcja przyjmuje wartosc najmniejsza ymin dla x = " + xMin1);
        System.out.println("Obiekt klasy anonimowej: ");
        System.out.println("Funkcja przyjmuje wartosc najmniejsza ymin dla x = " + xMin2);
        System.out.println("Lambda: ");
        System.out.println("Funkcja przyjmuje wartosc najmniejsza ymin dla x = " + xMin3);
    }
}
