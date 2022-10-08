package cw2.zad2;

@FunctionalInterface
interface FunDD {

    double fun(double x);
    static double xminim(FunDD f, double a, double b) {
        double xMin = a;
        double yMin = f.fun(a);
        for (double i = a; i <= b; i += 0.00001) {
//            System.out.println("i = " + i);
//            System.out.println("f.fun(i) = " + f.fun(i));
            if (f.fun(i) < yMin){
                yMin = f.fun(i);
                xMin = i;
            }
        }
        return xMin;
    }
}
