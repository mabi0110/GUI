package cw2.zad1;

public interface Func {
    double apply(double x);
    static Func compose(Func f, Func g) {
        return new Func() {
            @Override
            public double apply(double x) {
                return f.apply(g.apply(x));
            }
        };
    }
}
